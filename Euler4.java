/*
 * Euler Problem 4:
 * 
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * 
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */

public class Euler4 {
    public static void main(String[] args){
        int largestPalindrome = 0;
        // Generate all products of 3-digit numbers.
        for(int i = 100; i < 999; i++){
            for(int j = 100; j < 999; j++){
                String s = Integer.toString(i * j);
                // Check if s is a palindrome and overwrite largestPalindrome if it is larger than previous champion.
                if(s.equals(new StringBuilder(s).reverse().toString()) && ((i * j) > largestPalindrome)){
                    largestPalindrome = (i * j);
                }
            }
        }

        System.out.println(largestPalindrome);
    }
}
