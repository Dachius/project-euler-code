import java.util.*;

public class Euler023{
	public static void main(String[] args){
		long startTime = System.currentTimeMillis();

        
        HashSet<Integer> abundants = new HashSet<>();
		for(int i = 1; i <= 28123; i++){
			if(divisorSum(i) > i){
				abundants.add(i);
			}
		}

        long sum = 0;
        for(int i = 1; i < 28123; i++){
            boolean candidate = true;
            for(int a : abundants){
                if(abundants.contains(i - a)){
                    candidate = false;
                    break;
                }
            }

            if(candidate){
                sum += i;
            }
        }
		
		System.out.println("[" + (System.currentTimeMillis() - startTime) + "ms] Solution #23: " + sum);
	}
	
	public static int divisorSum(int num){
        int tempSum = 0;
        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0){
                if(i == num/i){
                    tempSum += i;
                } else{
                    tempSum += (i + num/i);
                }
            }
        }
        
        return tempSum + 1;
    }
}