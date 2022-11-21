/*
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * 
 * What is the 10 001st prime number?
 */
public class Euler007{
	public static void main(String[] args){
        long startTime = System.currentTimeMillis();
        
		int num = 2;
		
		for(int primes = 0; primes < 10001; num++){
			if(isPrime(num)){
				primes++;
			}
		}
		
		System.out.println("[" + (System.currentTimeMillis() - startTime) + "ms] Solution #7: " + (num - 1));
			
	}
	
    // Simple and fast primality test.
    // Concept is from wikipedia.org/wiki/Primality_test
	public static boolean isPrime(long n){
		if(n == 2 || n == 3){
			return true;
		} else if(n <= 1 || n % 2 == 0 || n % 3 == 0){
            return false;
        }

		for(long i = 5; i <= (int)Math.sqrt(n); i += 6){
			if(n % i == 0 || n % (i + 2) == 0){
				return false;
			}
		}
		return true;
	}
}