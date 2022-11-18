

public class Euler035{
	public static void main(String[] args){
		long startTime = System.currentTimeMillis();
		
		int circularCount = 0;
		
		for(int i = 0; i < 1000000; i++){
			boolean circularCandidate = true;
			String s = "" + i;
			int[] digits = new int[s.length()];
			for(int j = 0; j < s.length(); j++){
				digits[j] = Integer.parseInt(s.substring(j, j + 1));
			}
			for(int j = 0; j < digits.length; j++){
				int hold = digits[0];
				for(int k = 0; k < (digits.length - 1); k++){
					digits[k] = digits[k + 1];
				}
				digits[digits.length - 1] = hold;
				
				String tempString = "";
				for(int k = 0; k < digits.length; k++){
					tempString += digits[k];
				}
				
				if(!isPrime(Long.parseLong(tempString))){
					j = digits.length;
					circularCandidate = false;
				}
			}
			
			if(circularCandidate){
				circularCount++;
			}
		}
		
		System.out.println("[" + (System.currentTimeMillis() - startTime) + "ms] Solution #35: " + circularCount);
	}
	
	public static boolean isPrime(long test){
		
		if(test < 2){
			return false;
		}
		
		int sqrtTest = (int)Math.sqrt(test);
		for(long i = 2; i <= sqrtTest; i++){
			if(test % i == 0){
				return false;
			}
		}
		return true;
	}
}