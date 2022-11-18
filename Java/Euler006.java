/*
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * 
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */

public class Euler006{
	public static void main(String[] args){
        long startTime = System.currentTimeMillis();

		long sumOfSquares = 0, sum = 101 * 50;
		long squareOfSum = sum * sum;
		for(long i = 1; i <= 100; i++){
			sumOfSquares += i * i;
		}
		System.out.println("[" + (System.currentTimeMillis() - startTime) + "ms] Solution #6: " + (squareOfSum - sumOfSquares));
	}
}