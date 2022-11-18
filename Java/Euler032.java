import java.util.*;

public class Euler032 {
    public static void main(String[] args){
        long startTime = System.currentTimeMillis();

        ArrayList<String> pandigitals = permutations("123456789");
        ArrayList<Integer> products = new ArrayList<Integer>();

        for(int i = 0; i < 5; i++){
            for(int j = i + 1; j < 8; j++){
                for(int k = 0; k < pandigitals.size(); k++){
                    if(Integer.parseInt(pandigitals.get(k).substring(0, i + 1)) * Integer.parseInt(pandigitals.get(k).substring(i + 1, j + 1)) == Integer.parseInt(pandigitals.get(k).substring(j + 1, 9))){
                        products.add(Integer.parseInt(pandigitals.get(k).substring(j + 1, 9)));
                    }
                }
            }
        }

        removeDuplicates(products);
        long sum = 0;
        for(int i = 0; i < products.size(); i++){
			sum += products.get(i);
		}

        System.out.println("[" + (System.currentTimeMillis() - startTime) + "ms] Solution #32: " + sum);
    }

    //Removes duplicate entries from an ArrayList
	public static void removeDuplicates(ArrayList<Integer> list){
		for(int i = 0; i < list.size(); i++){
			Integer temp = list.get(i);
			list.remove(i);

			boolean toAdd = true;

			for(int j = 0; j < list.size(); j++){
				if(list.get(j).equals(temp)){
					toAdd = false;
				}
			}

			if(toAdd){
				list.add(temp);
			}
			else{
				i--;
			}
		}
	}

    //This finds permutations using recursion
	public static ArrayList<String> permutations(String s){
		ArrayList<String> permutationArray = new ArrayList<String>();
		permutations(permutationArray, s.toCharArray(), "");
		return permutationArray;
	}

	private static void permutations(ArrayList<String> building, char[] spares, String workingPermutation){
		if(spares.length == 0){
			//Base case:
			//If no more spares to concatenate recursively, add the complete string 
			building.add(workingPermutation);
			return;
		}
		else{
			//Recursive case: 
			for(int i = 0; i < spares.length; i++){
				permutations(building, removeAt(spares, i), workingPermutation + spares[i]);
			}
			return;
		}
	}
	
	//Returns a char[] which is the input char[] but with the character at an indicated index removed
	public static char[] removeAt(char[] charArray, int index){
		char[] toReturn = new char[charArray.length - 1];

		//toSubtract serves to have the index characters are being taken from charArray increase by 1, in order to correctly skip over the character at index
		int toSubtract = 0;

		for(int i = 0; i < charArray.length; i++){
			if(i != index){
				toReturn[i - toSubtract] = charArray[i];
			}
			else{
				toSubtract++;
			}
		}

		return toReturn;
	}
}
