public class Euler028{
	public static void main(String[] args){
		long startTime = System.currentTimeMillis();
        
		long sum = 1, cur = 1;
        for(int i = 1; i <= 500; i++){
            for(int j = 0; j < 4; j++){
                cur += 2 * i;
                sum += cur;
            }
        }
		
		System.out.println("[" + (System.currentTimeMillis() - startTime) + "ms] Solution #28: " + sum);
	}
}