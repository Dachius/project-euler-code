import java.util.*;

public class Euler050 {
    public static void main(String[] args){
        long startTime = System.currentTimeMillis();

        ArrayList<Integer> primes = new ArrayList<Integer>();

        //arbitraryish lower bound of 50,000
        //this is because 953 is the sum of 21 different primes
        for(int i = 0; i < 50000; i++){
            if(isPrime(i)){
                primes.add(i);
            }
        }

        int largest = 0;
        int mostPrimes = 0;

        for(int i = 0; i < primes.size(); i++){
            int sum = 0;
            for(int j = 0; sum < 1000000 && (i + j) < primes.size(); j++){
                sum += primes.get(i + j);

                if(isPrime(sum) && ((j + 1) > mostPrimes)){
                    largest = sum;
                    mostPrimes = (j + 1);
                }
            }
        }

        System.out.println("[" + (System.currentTimeMillis() - startTime) + "ms] Solution #50: " + largest + " " + mostPrimes);
    }

    //Checks if given long, "test", is a prime. 
    //Returns true if "test" is prime, false if "test" is not prime.
    public static boolean isPrime(long test){
            
        if(test < 2){
            return false;
        }
        
        int sqrtTest = (int)Math.sqrt(test);
        for(long i = 2; i <= sqrtTest; i++){
            if(test % i == 0){
                return false;
            }
        }
        return true;
    }
}
