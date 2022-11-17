import java.math.*;

public class Euler020{
	public static void main(String[] args){
		BigInteger num = new BigInteger("1");
		
		for(int i = 2; i <= 100; i++){
			num = num.multiply(new BigInteger("" + i));
		}
		
		String numString = num.toString();
		
		long sum = 0;
		
		for(int i = 0; i < numString.length(); i++){
			sum += Long.parseLong(numString.substring(i, i + 1));
		}
		
		System.out.println("Solution to Project Euler problem 16: " + sum);
	}
}