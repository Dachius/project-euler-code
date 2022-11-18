import java.math.*;

public class Euler053 {
    public static void main(String[] args){
        long startTime = System.currentTimeMillis();

        long count = 0;

        for(int i = 1; i <= 100; i++){
            for(int j = 1; j <= i; j++){
                if(choose(i, j).compareTo(new BigInteger("1000000")) >= 0){
                    count++;
                }
            }
        }

        System.out.println("[" + (System.currentTimeMillis() - startTime) + "ms] Solution #53: " + count);
    }

    public static BigInteger choose(int n, int r){
        if(n == r){
            return (new BigInteger("1"));
        }
        else{
            return factorial(new BigInteger("" + n)).divide(factorial(new BigInteger("" + r)).multiply(factorial(new BigInteger("" + (n - r)))));
        }
    }

    public static BigInteger factorial(BigInteger n){
        for(int i = Integer.parseInt(n.toString()) - 1; i > 1; i--){
            n = n.multiply(new BigInteger("" + i));
        }

        return n;
    }
}
