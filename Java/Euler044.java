public class Euler044{
	public static int[] pentagonals = new int[3000];
	
	public static void main(String[] args){
		long startTime = System.currentTimeMillis();
		
		int dif = 0;
		
		for(int i = 1; i <= 3000; i++){
			pentagonals[i - 1] = ((i * ((3 * i) - 1)) / 2);
		}
		
		for(int i = 1; i < pentagonals.length; i++){
			for(int j = 0; j < i; j++){
				if(isPentagonal(pentagonals[i] - pentagonals[j])){
					if(isPentagonal(pentagonals[i] + pentagonals[j])){
						dif = pentagonals[i] - pentagonals[j];
					}
				}
			}
		}
		
		System.out.println("[" + (System.currentTimeMillis() - startTime) + "ms] Solution #44: " + dif);
	}
	
	public static boolean isPentagonal(int n){
		int upper = pentagonals.length - 1, lower = 0;
		for(int i = 0; i < 13; i++){
			if(n > pentagonals[(lower + upper)/2]){
				lower = (lower + upper)/2;
			}
			else if(n < pentagonals[(lower + upper)/2]){
				upper = (lower + upper)/2;
			}
			else{
				return true;
			}
		}
		return false;
	}
}