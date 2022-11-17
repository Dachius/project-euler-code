public class Euler045{
	public static int arraySize = 100000;
	public static long[] triangulars = new long[arraySize], pentagonals = new long[arraySize], hexagonals = new long[arraySize];
	
	public static void main(String[] args){
		long startTime = System.currentTimeMillis();
		long num = 0;
		
		for(int i = 286; i <= arraySize; i++){
			triangulars[i - 1] = (((long)i * (i + 1))/2);
		}
		for(int i = 1; i <= arraySize; i++){
			pentagonals[i - 1] = (((long)i * ((3 * i) - 1)) / 2);
		}
		for(int i = 1; i <= arraySize; i++){
			hexagonals[i - 1] = ((long)i * ((2 * i) - 1));
		}
		
		for(int i = 0; i < arraySize; i++){
			if(isPentagonal(triangulars[i]) && isHexagonal(triangulars[i])){
				num = triangulars[i];
				i = arraySize;
			}
		}
		
		System.out.println("Time elapsed: " + (System.currentTimeMillis() - startTime) + "ms");
		System.out.println("Solution to Project Euler problem 45: " + num);
	}
	public static boolean isPentagonal(long n){
		int upper = pentagonals.length - 1, lower = 0;
		for(int i = 0; i < 20; i++){
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
	public static boolean isHexagonal(long n){
		int upper = hexagonals.length - 1, lower = 0;
		for(int i = 0; i < 20; i++){
			if(n > hexagonals[(lower + upper)/2]){
				lower = (lower + upper)/2;
			}
			else if(n < hexagonals[(lower + upper)/2]){
				upper = (lower + upper)/2;
			}
			else{
				return true;
			}
		}
		return false;
	}
}