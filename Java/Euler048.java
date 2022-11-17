import java.math.*;

public class Euler048{
	public static void main(String[] args){
		long startTime = System.currentTimeMillis();
		BigInteger sum = new BigInteger("0");
		
		for(int i = 1; i <= 1000; i++){
			BigInteger tempNum = new BigInteger("" + i);
			sum = sum.add(tempNum.pow(i));
		}
		System.out.println("Time elapsed: " + (System.currentTimeMillis() - startTime) + "ms");
		System.out.println("Solution to Project Euler problem 48: " + sum.toString().substring(sum.toString().length() - 10, sum.toString().length()));
	}
}