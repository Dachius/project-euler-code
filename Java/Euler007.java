import java.util.*;

public class Euler007{
	public static void main(String[] args){
		ArrayList<Integer> primes = new ArrayList<Integer>();
		
		for(int i = 2; primes.size() <= 10000; i++){
			
			if(isPrime(i)){
				primes.add(i);
			}
		}
		
		System.out.println("Solution to Project Euler problem 7: " + primes.get(10000));
			
	}
	
	public static boolean isPrime(int test){
		//	This is highly inefficient- I know. ;-;
		for(int i = 2; i < test; i++){
			if(test % i == 0){
				return false;
			}
		}
		return true;
	}
}