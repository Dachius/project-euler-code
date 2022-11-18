import java.util.*;

public class Euler012{
	
	//first 1k primes
	public static int[] primes =  new int[1000];
	
	public static void main(String[] args){
        long startTime = System.currentTimeMillis();

		ArrayList<Long> TriangularNumbers = new ArrayList<Long>();
		
		int index = 0;
		
		//populate the primes array
		populatePrimes();
		
		//add base case
		TriangularNumbers.add((long)1);
		
		//10mil Triangular Numbers
		for(int i = 1; i < 10000000; i++){
			TriangularNumbers.add(TriangularNumbers.get(i - 1) + i + 1);
		}
		
		for(int i = 0; i < TriangularNumbers.size(); i++){
			if(divisorCount(TriangularNumbers.get(i)) > 500){
				index = i;
				i = TriangularNumbers.size() + 1;
			}
		}
		
		System.out.println("[" + (System.currentTimeMillis() - startTime) + "ms] Solution #12: " + TriangularNumbers.get(index));
	}
	
	public static long divisorCount(long num){
		long tempNum = num;
		
		long tempCount = 1;
		
		//7919 is the 1000th prime, we're only checking to the 1000th prime for prime divisors.
		int[] primeDivisors = new int[7920];
		
		for(int i = 0; i < primes.length; i++){
			if(tempNum % primes[i] == 0){
				primeDivisors[primes[i]] += 1;
				
				tempNum /= primes[i];
				i = -1;
			}
		}
		
		for(int i = 0; i < primeDivisors.length; i++){
			if(primeDivisors[i] != 0){
				tempCount *= (primeDivisors[i] + 1);
			}
		}
		
		return tempCount;
	}
	
	public static void populatePrimes(){
		int i = 0;
		
		for(int j = 2; primes[primes.length - 1] == 0; j++){
			if(isPrime(j)){
				primes[i] = j;
				i++;
			}
		}
	}
	
	public static boolean isPrime(long test){
		//	This is highly inefficient- I know. ;-;
		for(long i = 2; i <= Math.sqrt(test); i++){
			if(test % i == 0){
				return false;
			}
		}
		return true;
	}
}