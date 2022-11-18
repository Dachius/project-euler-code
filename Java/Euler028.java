

public class Euler028{
	public static void main(String[] args){
		long startTime = System.currentTimeMillis();
        
		long sum = 2001, bigCounter = 2000;
		
		for(int i = 2; bigCounter > 0; i += 2){
			for(int j = 0; j < 4; j++){
				sum += (i * bigCounter);
				bigCounter--;
			}
		}
		
		
		System.out.println("[" + (System.currentTimeMillis() - startTime) + "ms] Solution #28: " + sum);
	}
}