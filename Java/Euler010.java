public class Euler010{
	public static void main(String[] args){
        long startTime = System.currentTimeMillis();
        
        System.out.println("[" + (System.currentTimeMillis() - startTime) + "ms] Solution #10: " + sumPrimes(2000000));
	}
	
	// Implement sieve of Eratosthenes
	public static long sumPrimes(int n){
        long sum = 0;
        boolean[] nums = new boolean[n];
        for(long i = 1; i < n; i++){
            if(!nums[(int)i]){
                sum += (i + 1);
                for(long j = (i + 1) * (i + 1); j <= n; j += (i + 1)){
                    nums[(int)(j - 1)] = true;
                }
            }
        }

        return sum;
    }
}