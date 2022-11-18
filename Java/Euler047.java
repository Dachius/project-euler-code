import java.util.*;

public class Euler047{
	public static ArrayList<Long> primes = new ArrayList<Long>(), doubledSquares = new ArrayList<Long>();
	
	public static void main(String[] args){
		long startTime = System.currentTimeMillis();
		
		int first = 0;
		
		primes.add((long)2);
		for(int i = 1; i < 1000000; i += 2){
			if(isPrime(i)){
				primes.add((long)i);
			}
		}
		
		int sequential = 0;
		boolean unfound = true;
		for(int i = 1; unfound; i++){
			if(distinctFactorCount(i) == 4){
				sequential++;
				if(sequential == 4){
					first = i - 3;
					unfound = false;
				}
			}
			else{
				sequential = 0;
			}
		}
		
		System.out.println("[" + (System.currentTimeMillis() - startTime) + "ms] Solution #47: " + first);
	}
    public static boolean isPrime(long test){
        
        if(test < 2){
            return false;
        }
        
        int sqrtTest = (int)Math.sqrt(test);
        for(long i = 2; i <= sqrtTest; i++){
            if(test % i == 0){
                return false;
            }
        }
        return true;
    }
	
	public static int distinctFactorCount(long num){
		ArrayList<Long> factors = new ArrayList<Long>();
		for(int i = 0; num > 1; i++){
			if(num % primes.get(i) == 0){
				if(!(factors.contains((long)primes.get(i)))){
					factors.add(primes.get(i));
				}
				num /= primes.get(i);
				i = -1;
			}
		}
		return factors.size();
	}
}