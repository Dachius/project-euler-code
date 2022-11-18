import java.util.*;

public class Euler046{
	public static ArrayList<Long> oddComposites = new ArrayList<Long>(), primes = new ArrayList<Long>(), doubledSquares = new ArrayList<Long>();
	
	public static void main(String[] args){
		long startTime = System.currentTimeMillis();
		long smallest = 0;
		
		primes.add((long)2);
		
		for(int i = 3; i < 100000; i += 2){
			if(isPrime(i)){
				primes.add((long)i);
			}
			else{
				oddComposites.add((long)i);
			}
		}
		
		for(int i = 1; i < 10000; i++){
			doubledSquares.add((long)(2 * Math.pow(i, 2)));
		}
		
		for(int i = 0; i < oddComposites.size(); i++){
			int largestIndex = primeIndex(oddComposites.get(i));
			boolean flag = true;
			for(int j = 0; j < largestIndex; j++){
				if(isDoubledSquare(oddComposites.get(i) - primes.get(j))){
					flag = false;
				}
			}
			
			if(flag){
				smallest = oddComposites.get(i);
				i = oddComposites.size();
			}
		}
		
		System.out.println("[" + (System.currentTimeMillis() - startTime) + "ms] Solution #46: " + smallest);
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
	public static boolean isDoubledSquare(long n){
		if(doubledSquares.get(doubledSquares.size() - 1) == n){
			return true;
		}
		
		int upper = doubledSquares.size() - 1, lower = 0;
		for(int i = 0; i < 20; i++){
			if(n > doubledSquares.get((lower + upper)/2)){
				lower = (lower + upper)/2;
			}
			else if(n < doubledSquares.get((lower + upper)/2)){
				upper = (lower + upper)/2;
			}
			else{
				return true;
			}
		}
		return false;
	}
	
	public static int primeIndex(long n){
		if(primes.get(primes.size() - 1) == n){
			return primes.size() - 1;
		}
		
		int upper = primes.size() - 1, lower = 0;
		for(int i = 0; i < 20; i++){
			if(upper - lower == 1){
				return upper;
			}
			else if(n > primes.get((lower + upper)/2)){
				lower = (lower + upper)/2;
			}
			else if(n < primes.get((lower + upper)/2)){
				upper = (lower + upper)/2;
			}
			else{
				return ((lower + upper)/2);
			}
		}
		return upper;
	}
}