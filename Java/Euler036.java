/*
 * There's room for extreme optimization on this problem. In fact, we need only check 1110 different possibilities
 * due to various mathematical results on the form of decimal fractions. However, this seems like vast overkill.
 */

public class Euler036{
	public static void main(String[] args){
		long startTime = System.currentTimeMillis();
        
		long sum = 0;
		for(int i = 1; i < 1000000; i += 2){
			if(isPalindrome(Integer.toString(i)) && isPalindrome(Integer.toBinaryString(i))){
				sum += i;
			}
		}
		
		System.out.println("[" + (System.currentTimeMillis() - startTime) + "ms] Solution #36: " + sum);
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