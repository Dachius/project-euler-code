import java.math.*;

public class Euler056{
    public static void main(String[] args){
        long startTime = System.currentTimeMillis();

        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < 100; i++){
            for(int j = 0; j < 100; j++){
                int sum = digitSum(new BigInteger("" + i).pow(j));
                if(sum > maxSum){
                    maxSum = sum;
                }
            }
        }
        
        System.out.println("[" + (System.currentTimeMillis() - startTime) + "ms] Solution #56: " + maxSum);
    }

    public static int digitSum(BigInteger n){
        int sum = 0;

        String num = n.toString();

        for(int i = 0; i < num.length(); i++){
            sum += Integer.parseInt(num.substring(i, i + 1));
        }

        return sum;
    }
}