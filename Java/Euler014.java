public class Euler014{
	public static void main(String[] args){
        long startTime = System.currentTimeMillis();
		
		long maxSteps = 0, num = 0;
		
		for(int i = 1; i < 1000000; i++){
			long tempStep = collatzStep(i);
			if(tempStep > maxSteps){
				maxSteps = tempStep;
				num = i;
			}
		}
        
		System.out.println("[" + (System.currentTimeMillis() - startTime) + "ms] Solution #14: " + num);
	}
	
	public static long collatzStep(long n){
		long steps = 0;
		
		while(n!= 1){
			//n is even
			if(n % 2 == 0){
				n /= 2;
			}
			//n is odd
			else{
				n = (n * 3) + 1;
			}
			steps++;
		}
		
		return steps;
	}
}