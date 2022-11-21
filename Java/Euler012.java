public class Euler012{
	public static void main(String[] args){
        long startTime = System.currentTimeMillis();
        
		for(int i = 1; true; i++){
            long count;
            if(i % 2 == 0){
                count = divisorCount(i / 2) * divisorCount(i + 1);
            } else{
                count = divisorCount(i) * divisorCount((i + 1) / 2);
            }
            
			if(count > 500){
                System.out.println("[" + (System.currentTimeMillis() - startTime) + "ms] Solution #12: " + (i * (i + 1)/2));
                System.exit(0);
			}
		}
	}
	
	public static long divisorCount(long num){
        int count = 0, sqrt = (int)Math.sqrt(num);
        
        for(int i = 1; i < sqrt; i++){
            if(num % i == 0){
                count += 2;
            }
        }

        if(count == sqrt * sqrt){
            count++;
        }
		
		return count;
	}
}