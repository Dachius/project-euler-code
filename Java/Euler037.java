

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
			if(!(isPrime(Integer.parseInt(s.substring(i, s.length()))) && isPrime(Integer.parseInt(s.substring(0, s.length() - i))))){
				return false;
			}
		}
		return true;
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
}