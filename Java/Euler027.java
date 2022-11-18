

public class Euler027{
	public static void main(String[] args){
		long startTime = System.currentTimeMillis();
		
		int highestA = 0, highestB = 0, highestN = 0;
		for(int a = -999; a < 1000; a++){
			for(int b = -999; b < 1000; b++){
				boolean toggle = true;
				for(int n = 0; toggle; n++){
					if(!isPrime(n * n + a * n + b)){
						toggle = false;
						if((n - 1) > highestN){
							highestN = (n - 1);
							highestA = a;
							highestB = b;
						}
					}
				}
			}
		}
		
		System.out.println("[" + (System.currentTimeMillis() - startTime) + "ms] Solution #27: " + (highestA * highestB));
	}
	
	public static boolean isPrime(long test){
		
		if(test < 1){
			return false;
		}
		
		if(test == 1){
			return false;
		}
		
		if(test == 2 || test == 3){
			return true;
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