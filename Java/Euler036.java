

public class Euler036{
	public static void main(String[] args){
		long startTime = System.currentTimeMillis();
		long sum = 0;
		
		for(int i = 1; i < 1000000; i ++){
			if(isPalindrome("" + i) && isPalindrome(Integer.toBinaryString(i))){
				sum += i;
			}
		}
		
		System.out.println("Time elapsed: " + (System.currentTimeMillis() - startTime) + "ms");
		System.out.println("Solution to Project Euler problem 36: " + sum);
	}
	
	public static boolean isPalindrome(String s){
		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i) != s.charAt(s.length() - 1 - i)){
				return false;
			}
		}
		
		return true;
	}
}