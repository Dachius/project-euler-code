import java.math.*;

public class Euler010{
	public static void main(String[] args){
		
		BigInteger sum = new BigInteger("0");
		
		for(int i = 2; i < 2000000; i++){
			if(isPrime(i)){
				sum = sum.add(new BigInteger("" + i));
			}
		}
		
		System.out.println("Solution to Project Euler problem 10: " + sum);
	}
	
	public static boolean isPrime(int test){
		//	This is highly inefficient- I know. ;-;
		for(int i = 2; i <= Math.sqrt(test); i++){
			if(test % i == 0){
				return false;
			}
		}
		return true;
	}
}