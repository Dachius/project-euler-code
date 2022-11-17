import java.util.*;

public class Euler024 {
    public static void main(String[] args){
		long startTime = System.currentTimeMillis();
		
		ArrayList<String> permutations = permutations("0123456789");
		
		System.out.println("Time elapsed: " + (System.currentTimeMillis() - startTime) + "ms");
		System.out.println("Solution to Project Euler problem 24: " + permutations.get(999999));
    }

    //This finds permutations using recursion
	public static ArrayList<String> permutations(String s){
		ArrayList<String> permutationArray = new ArrayList<String>();
		permutations(permutationArray, s.toCharArray(), "");
		return permutationArray;
	}

	public static void permutations(ArrayList<String> building, char[] spares, String workingPermutation){
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