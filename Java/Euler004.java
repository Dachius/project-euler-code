/**
 * Euler Problem 4:
 * 
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * 
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */

public class Euler004 {
    public static void main(String[] args){
        long startTime = System.currentTimeMillis();

        int largestPalindrome = 0;
        // Generate all products of 3-digit numbers.
        for(int i = 100; i < 999; i++){
            for(int j = i; j < 999; j++){
                // Compute reverse of product
                int trueProduct = i * j, product = trueProduct, reversedProduct = 0;

                while(product != 0){
                    reversedProduct = reversedProduct * 10 + product % 10;
                    product /= 10;
                }

                // Reassign if larger
                if(reversedProduct == trueProduct && trueProduct > largestPalindrome){
                    largestPalindrome = trueProduct;
                }
            }
        }
        System.out.println("[" + (System.currentTimeMillis() - startTime) + "ms] Solution #4: " + largestPalindrome);
        
    }
}
