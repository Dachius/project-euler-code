/**
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 *
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */

public class Euler005{
    public static final int MAX = 20;
    // x | y iff y contains (at least) all of the prime factors in x in (at least) equal numbers.
    // Therefore we factorize 1 <= n <= 20, find the minimum set of prime factors such that the above condition is met for all numbers, and multiply.
	public static void main(String[] args){
        long startTime = System.currentTimeMillis();

		int[] maxOfEachPrimeFactor = new int[MAX];
        for(int i = 0; i < MAX; i++){
            int[] factors = factorize(i + 1);
            for(int j = 0; j < MAX; j++){
                maxOfEachPrimeFactor[j] = Math.max(maxOfEachPrimeFactor[j], factors[j]);
            }
        }

        // Find product of prime factors.
        long product = 1L;
        for(int i = 0; i < MAX; i++){
            product *= Math.pow(i + 1, maxOfEachPrimeFactor[i]);
        }

        System.out.println("[" + (System.currentTimeMillis() - startTime) + "ms] Solution #5: " + product);
    }

    // Get prime factors.
    public static int[] factorize(int num){
        int[] factors = new int[MAX];
        for(int i = 2; i <= num; i++){
            if(num % i == 0){
                factors[i - 1]++;
                num /= i;
                i--;
            }
        }

        return factors;
    }
}