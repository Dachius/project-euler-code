import java.util.*;

public class Euler023{
	public static void main(String[] args){
		long startTime = System.currentTimeMillis();

		ArrayList<Integer> abundants = new ArrayList<Integer>();
		for(int i = 12; i < 28123; i++){
			if(divisorSum(i) > i){
				abundants.add(i);
			}
		}
		
		ArrayList<Integer> abundantSums = new ArrayList<Integer>();
		for(int i = 0; i < abundants.size(); i++){
			for(int j = 0; j <= i; j++){
				abundantSums.add(abundants.get(i) + abundants.get(j));
			}
		}
		
		Collections.sort(abundantSums);
		
		long nonSumSum = 0;
		int lastIndex = 0;
		for(int i = 1; i < 28123; i++){
			boolean candidate = false;
			for(int j = lastIndex; j < abundantSums.size(); j++){
				if(abundantSums.get(j) == i){
					lastIndex = j + 1;
					candidate = true;
					j = abundantSums.size();
				}
				else if(abundantSums.get(j) > i){
					j = abundantSums.size();
				}
			}
			if(!candidate){
				nonSumSum += i;
			}
		}
		
		System.out.println("[" + (System.currentTimeMillis() - startTime) + "ms] Solution #23: " + nonSumSum);
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