public class Euler030{
	public static void main(String[] args){
		long startTime = System.currentTimeMillis();
        
		
		
        // Choose 300,000 as maximum because 9^5 * 6 < 360,000.
        long sum = 0;
		for(int i = 2; i < 360000; i++){
			if(equalsSumOfFifthPowersOfDigits(i)){
				sum += i;
			}
		}
		
		System.out.println("[" + (System.currentTimeMillis() - startTime) + "ms] Solution #30: " + sum);
	}
	
	public static boolean equalsSumOfFifthPowersOfDigits(int n){
		
		char[] chars = Integer.toString(n).toCharArray();
		
		long sum = 0;
		for(int i = 0; i < chars.length; i++){
			sum += Math.pow(chars[i] - '0', 5);
		}
		
		return (sum == n);
	}
}