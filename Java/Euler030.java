public class Euler030{
	public static void main(String[] args){
		long startTime = System.currentTimeMillis();
		long sum = 0;
		
		for(int i = 2; i < 1000000; i++){
			if(equalsSumOfFifthPowersOfDigits(i)){
				sum += i;
			}
		}
		
		System.out.println("Time elapsed: " + (System.currentTimeMillis() - startTime) + "ms");
		System.out.println("Solution to Project Euler problem 30: " + sum);
	}
	
	public static boolean equalsSumOfFifthPowersOfDigits(int n){
		String s = "" + n;
		
		char[] chars = s.toCharArray();
		
		long sumOfFifths = 0;
		
		for(int i = 0; i < chars.length; i++){
			sumOfFifths += Math.pow(Integer.parseInt("" + chars[i]), 5);
		}
		
		return (sumOfFifths == n);
	}
}