public class Euler014{
    public static void main(String[] args){
        long startTime = System.currentTimeMillis();
		
		long maxSteps = 0, maxNum = 0;
		for(int i = 500001; i < 1000000; i += 2){
			long tempStep = stepCount(i);
			if(tempStep > maxSteps){
				maxSteps = tempStep;
			    maxNum = i;
			}
		}
        
		System.out.println("[" + (System.currentTimeMillis() - startTime) + "ms] Solution #14: " + maxNum);
	}
	
	public static long stepCount(long n){
		long steps = 0;
		while(n != 1){
			if(n % 2 == 0){
				n /= 2;
			} else{
				n = (n * 3) + 1;
			}
			steps++;
		}
		
		return steps;
	}
}