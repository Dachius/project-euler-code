import java.util.*;

public class Euler021{
    public static void main(String[] args){
        long startTime = System.currentTimeMillis();

        HashMap<Integer, Integer> map = new HashMap<>();
        
        int amicableSum = 0;
        for(int i = 1; i < 10000; i++){
            int divisorSum = divisorSum(i);
            if(divisorSum != i){
                map.put(i, divisorSum(i));
            }

            if(map.containsKey(divisorSum) && map.get(divisorSum) == i){
                amicableSum += divisorSum + i;
            }
        }
        System.out.println("[" + (System.currentTimeMillis() - startTime) + "ms] Solution #21: " + amicableSum);
    }
    
    public static int divisorSum(int num){
        int tempSum = 0, sqrt = (int)Math.sqrt(num);

        for(int i = 1; i < sqrt; i++){
            if(num % i == 0){
                tempSum += i + num/i;
            }
        }
        
        if(num == sqrt * sqrt){
            tempSum += sqrt;
        }

        return tempSum;
    }
}