public class Euler021{
    public static void main(String[] args){
        
        int amicableSum = 0;
        
        for(int i = 1; i < 10000; i++){
            if((i == divisorSum(divisorSum(i))) && divisorSum(i) != i){
                amicableSum += i;
            }
        }
        
        System.out.println("Solution to Project Euler problem 21: " + amicableSum);
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