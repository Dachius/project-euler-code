import java.math.*;

public class Euler048{
	public static void main(String[] args){
		long startTime = System.currentTimeMillis();
        
		BigInteger sum = new BigInteger("0");
		
		for(int i = 1; i <= 1000; i++){
			BigInteger tempNum = new BigInteger("" + i);
			sum = sum.add(tempNum.pow(i));
		}

		System.out.println("[" + (System.currentTimeMillis() - startTime) + "ms] Solution #48: " + sum.toString().substring(sum.toString().length() - 10, sum.toString().length()));
	}
}