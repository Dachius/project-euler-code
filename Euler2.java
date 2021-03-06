/**
 * Euler Problem 2:
 * Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:
 *
 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * 
 * By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
 */

public class Euler2 {
    public static void main(String[] args){
        // sum starts at 2, not 0, in order to count the Fibonacci number 2.
        int fib1 = 1, fib2 = 2, fib3 = 3, sum = 2;

        while(fib3 <= 4000000){
            fib3 = fib2 + fib1;

            // Add even-valued Fibonacci numbers to sum.
            if(fib3 % 2 == 0){
                sum += fib3;
            }

            // Shift fibonacci numbers "leftwards", disposing of unneeded value.
            fib1 = fib2;
            fib2 = fib3;
        }

        System.out.println(sum);
    }
}
