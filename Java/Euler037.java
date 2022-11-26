public class Euler037{
	public static void main(String[] args){
		long startTime = System.currentTimeMillis();
        
		long sum = 0;
		
		for(int i = 10; i < 1000000; i++){
			if(isTruncatable(i)){
				sum += i;
			}
		}
		
		System.out.println("[" + (System.currentTimeMillis() - startTime) + "ms] Solution #37: " + sum);
	}

	public static boolean isTruncatable(int test){
		String s = "" + test;
		for(int i = s.length() - 1; i >= 0; i--){
			if(!(isPrime(Integer.parseInt(s.substring(0, s.length() - i))) && isPrime(Integer.parseInt(s.substring(i, s.length()))))){
				return false;
			}
		}
		return true;
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