public class Euler006{
	public static void main(String[] args){
		long sumOfSquares = 0, sum = 101 * 50;
		long squareOfSum = sum * sum;
		for(long i = 1; i <= 100; i++){
			sumOfSquares += i * i;
		}
		System.out.println("Solution to Project Euler problem 6: " + (squareOfSum - sumOfSquares));
	}
}