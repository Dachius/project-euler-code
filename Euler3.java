/*
 * Euler Problem 3:
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * 
 * What is the largest prime factor of the number 600851475143 ?
 */

public class Euler3 {
    public static void main(String[] args){
        long num = 600851475143L, largestPrimeFactor = 0;

        // Run through numbers less than num, and eliminate prime factors in ascending order for efficiency.
        for(long i = 2; i < num; i++){
            if(num % i == 0){
                num /= i;
                largestPrimeFactor =  i;
                i = 2;
            }
        }

        System.out.println(largestPrimeFactor);
    }
}
