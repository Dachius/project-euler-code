import java.util.*;

public class Euler038 {
    public static void main(String[] args){
        long startTime = System.currentTimeMillis();

        ArrayList<Long> concats = new ArrayList<Long>();
        ArrayList<Long> pandigitals = stringsToLongs(permutations("123456789"));

        for(int i = 1; i < 10000; i++){
            String concat = "";
            for(int j = 1; concat.length() < 9; j++){
                concat += i * j;
            }

            if(concat.length() == 9){
                concats.add(Long.parseLong(concat));
            }
        }

        Collections.sort(concats);

        for(int i = concats.size() - 1; i >= 0; i--){
            if(pandigitals.contains(concats.get(i))){
                System.out.println("[" + (System.currentTimeMillis() - startTime) + "ms] Solution #38: " + concats.get(i));
                System.exit(0);
            }
        }
    }

    public static ArrayList<Long> stringsToLongs(ArrayList<String> list){
        ArrayList<Long> building = new ArrayList<Long>();

        for(int i = 0; i < list.size(); i++){
            //if statement is problem specific
            //remove if statement if not using for super similar application
            if(!(list.get(i).charAt(0) == '0')){
                building.add(Long.parseLong(list.get(i)));
            }
        }

        return building;
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
