import java.math.*;

public class Euler016{
	public static void main(String[] args){
		BigInteger num = new BigInteger("1");
		
		BigInteger two = new BigInteger("2");
		
		for(int i = 0; i < 1000; i++){
			num = num.multiply(two);
		}
		
		String numString = num.toString();
		
		long sum = 0;
		
		for(int i = 0; i < numString.length(); i++){
			sum += Long.parseLong(numString.substring(i, i + 1));
		}
		
		System.out.println("Solution to Project Euler problem 16: " + sum);
	}
}