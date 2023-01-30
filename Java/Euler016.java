/**
 * 215 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
 * 
 * What is the sum of the digits of the number 21000?
 */

import java.math.*;

public class Euler016{
	public static void main(String[] args){
        long startTime = System.currentTimeMillis();
        
        BigInteger two = new BigInteger("2");
		BigInteger num = two.pow(1000);
		String numString = num.toString();

		long sum = 0;
		for(int i = 0; i < numString.length(); i++){
			sum += numString.charAt(i) - '0';
		}
		
		System.out.println("[" + (System.currentTimeMillis() - startTime) + "ms] Solution #16: " + sum);
	}
}