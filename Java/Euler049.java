import java.util.*;

public class Euler049{
	public static ArrayList<Integer> primes = new ArrayList<Integer>();
	
	public static void main(String[] args){
		long startTime = System.currentTimeMillis();

		for(int i = 1000; i < 10000; i++){
			if(isPrime(i)){
				primes.add(i);
			}
		}
		
		for(Integer prime : primes){
			ArrayList<Integer> primePermutations = removeDuplicates(getPrimePermutations(prime));
			Collections.sort(primePermutations);
			for(int i = 0; i < primePermutations.size(); i++){
				for(int j = 0; j < i; j++){
					for(int k = 0; k < j; k++){
						if((primePermutations.get(i) - primePermutations.get(j)) == (primePermutations.get(j) - primePermutations.get(k))){
							if(primePermutations.get(k).equals(1487)){
								break;
							}
							else{
								System.out.println("Time elapsed: " + (System.currentTimeMillis() - startTime) + "ms");
								System.out.println("Solution to Project Euler problem 49: " + primePermutations.get(k) + primePermutations.get(j) + primePermutations.get(i));
								System.exit(0);
							}
						}
					}
				}
			}
		}
		
	}
	
    public static boolean isPrime(int test){
        
        if(test < 2){
            return false;
        }
        
        int sqrtTest = (int)Math.sqrt(test);
        for(int i = 2; i <= sqrtTest; i++){
            if(test % i == 0){
                return false;
            }
        }
        return true;
    }
	
	public static ArrayList<Integer> getPrimePermutations(Integer prime){
		ArrayList<String> permutationArray = permutations("" + prime);
		ArrayList<Integer> nums = new ArrayList<Integer>();
		for(String s : permutationArray){
			if(isPrime(Integer.parseInt(s)) && Integer.valueOf(s).toString().length() == 4){
				nums.add(Integer.parseInt(s));
			}
		}

		return nums;
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


	//Removes duplicate entries from an ArrayList
	public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list){
		ArrayList<Integer> building = new ArrayList<Integer>();
		
		for(int i = 0; i < list.size(); i++){
			boolean toAdd = true;
			for(Integer n : building){
				if(list.get(i).equals(n)){
					toAdd = false;
				}
			}

			if(toAdd){
				building.add(list.get(i));
			}
		}

		return building;
	}
}