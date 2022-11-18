import java.util.*;

public class Euler041{
	public static void main(String[] args){
		long startTime = System.currentTimeMillis();
		
		char[] chars = new char[]{'1', '2', '3', '4', '5', '6', '7', '8', '9'};
		ArrayList<String> omegaPermutations = new ArrayList<String>();
		ArrayList<String> permutations = new ArrayList<String>();
		
		for(int i = 1; i < 10; i++){
			permutations.add("" + i);
		}
		
		for(int i = 1; i < 9; i++){
			ArrayList<String> tempPermutations = new ArrayList<String>();
			for(int j = 0; j < permutations.size(); j++){
				//determine characters not present and add them to array
				char[] charArray = permutations.get(j).toCharArray();
				
				ArrayList<Character> absentChars = new ArrayList<Character>();
				for(int k = 0; k < chars.length; k++){
					boolean absent = true;
					for(int l = 0; l < charArray.length; l++){
						if(chars[k] == charArray[l]){
							absent = false;
							l = charArray.length;
						}
					}
					if(absent){
						absentChars.add(chars[k]);
					}
				}
				
				for(int k = 0; k < absentChars.size(); k++){
					tempPermutations.add(permutations.get(j) + absentChars.get(k));
				}
				
			}
			
			omegaPermutations.addAll(tempPermutations);
			permutations = tempPermutations;
		}
		
		ArrayList<Long> nums = new ArrayList<Long>();
		
		for(int i = 0; i < omegaPermutations.size(); i++){
			nums.add(Long.parseLong(omegaPermutations.get(i)));
		}
		
		long highestPrime = 0;
		
		Collections.sort(nums);
		
		for(int i = (nums.size() - 1); i >= 0; i--){
			if(isPrime(nums.get(i))){
				if(nums.get(i).toString().length() == getHighestDigit(nums.get(i))){
					highestPrime = nums.get(i);
					i = -1;
				}
			}
		}
		
		System.out.println("[" + (System.currentTimeMillis() - startTime) + "ms] Solution #41: " + highestPrime);
	}
	
	public static boolean isPrime(long test){
		
		if(test == 1){
			return false;
		}
		
		if(test == 2 || test == 3){
			return true;
		}
		
		
		for(long i = 2; i <= (int)Math.sqrt(test); i++){
			if(test % i == 0){
				return false;
			}
		}
		return true;
	}
	
	public static int getHighestDigit(long n){
		int highestDigit = 0;
		
		String nString = "" + n;
		for(int i = 0; i < nString.length(); i++){
			if(Integer.parseInt(nString.substring(i, i + 1)) > highestDigit){
				highestDigit = Integer.parseInt(nString.substring(i, i + 1));
			}
		}
		
		return highestDigit;
	}
}