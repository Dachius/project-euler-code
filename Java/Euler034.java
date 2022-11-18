

public class Euler034{
	public static void main(String[] args){
		long startTime = System.currentTimeMillis();
		
		long sum = 0;
		for(int i = 10; i <= 2540160; i++){
			String s = "" + i;
			int tempSum = 0;
			int[] digits = new int[s.length()];
			for(int j = 0; j < s.length(); j++){
				digits[j] = Integer.parseInt(s.substring(j, j + 1));
			}
			for(int j = 0; j < digits.length; j++){
				tempSum += factorial(digits[j]);
			}
			
			if(tempSum == i){
				sum += i;
			}
		}
		
		System.out.println("[" + (System.currentTimeMillis() - startTime) + "ms] Solution #34: " + sum);
	}
	
	public static int factorial(int n){
		int temp = 1;
		
		for(int i = n; i > 0; i--){
			temp *= i;
		}
		
		return temp;
	}
}