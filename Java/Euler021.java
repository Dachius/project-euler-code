public class Euler021{
    public static void main(String[] args){
        long startTime = System.currentTimeMillis();
        
        int amicableSum = 0;
        
        for(int i = 1; i < 10000; i++){
            if((i == divisorSum(divisorSum(i))) && divisorSum(i) != i){
                amicableSum += i;
            }
        }
        System.out.println("[" + (System.currentTimeMillis() - startTime) + "ms] Solution #21: " + amicableSum);
    }
    
    public static int divisorSum(int num){
        int tempSum = 0;
        for(int i = 1; i < num; i++){
            if(num % i == 0){
                tempSum += i;
            }
        }
        
        return tempSum;
    }
}