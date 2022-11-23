public class Euler034{
	public static void main(String[] args){
		long startTime = System.currentTimeMillis();
		
        // Theoretical maximum is 7 * 9! = 2540160
		long sum = 0;
		for(int i = 10; i <= 2540160; i++){
			int tempSum = 0;

            char[] digits = Integer.toString(i).toCharArray();
			for(int j = 0; j < digits.length; j++){
				tempSum += factorial(digits[j] - '0');
			}
			
			if(tempSum == i){
				sum += i;
			}
		}
		
		System.out.println("[" + (System.currentTimeMillis() - startTime) + "ms] Solution #34: " + sum);
	}
	
    public static int[] factorialTable = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880};
	public static int factorial(int n){
		return factorialTable[n];
	}
}