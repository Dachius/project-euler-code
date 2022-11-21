public class Euler027{
	public static void main(String[] args){
		long startTime = System.currentTimeMillis();
		
		int highestA = 0, highestB = 0, highestN = 0;
		for(int a = -999; a < 1000; a++){
			for(int b = -1000; b <= 1000; b++){
				for(int n = 0; true; n++){
					if(!isPrime(n * n + a * n + b)){
						if((n - 1) > highestN){
							highestN = (n - 1);
							highestA = a;
							highestB = b;
						}

                        break;
					}
				}
			}
		}
		
		System.out.println("[" + (System.currentTimeMillis() - startTime) + "ms] Solution #27: " + (highestA * highestB));
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