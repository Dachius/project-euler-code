public class Euler021{
    public static void main(String[] args){
        long startTime = System.currentTimeMillis();
        
        int amicableSum = 0;
        
        for(int i = 1; i < 10000; i++){
            int iSum = divisorSum(i);
            if((i == divisorSum(iSum)) && iSum != i){
                amicableSum += i;
            }
        }
        System.out.println("[" + (System.currentTimeMillis() - startTime) + "ms] Solution #21: " + amicableSum);
    }
    
    public static int divisorSum(int num){
        int tempSum = 0, sqrt = (int)Math.sqrt(num);

        for(int i = 2; i < sqrt; i++){
            if(num % i == 0){
                tempSum += (i + num/i);
            }
        }
        
        if(num == sqrt * sqrt && num != 1){
            tempSum += sqrt;
        }

        return tempSum + 1;
    }
}