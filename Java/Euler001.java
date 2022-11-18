/**
 * Euler Problem 1:
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * 
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */

public class Euler001{
    public static void main(String[] args){
        long startTime = System.currentTimeMillis();

        int sum = 0;

        // Check each natural number with value < 1000.
        for(int i = 1; i < 1000; i++){
            // Checks if i is divisible by 3 and/or 5.
            if((i % 3 == 0) || (i % 5 == 0)){
                sum += i;
            }
        }

        System.out.println("[" + (System.currentTimeMillis() - startTime) + "ms] Solution #1: " + sum);
    }
}