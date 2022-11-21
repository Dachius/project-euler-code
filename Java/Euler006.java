/*
 * The sum of the squares of the first ten natural numbers is 385.
 * 
 * The square of the sum of the first ten natural numbers is 3025.
 * 
 * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 - 385 = 2640.
 * 
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
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