import java.util.*;
import java.math.*;

public class Euler029{
	public static void main(String[] args){
		long startTime = System.currentTimeMillis();
		ArrayList<BigInteger> combinations = new ArrayList<BigInteger>();
		
		for(int a = 2; a <= 100; a++){
			for(int b = 2; b <= 100; b++){
				BigInteger tempNum = new BigInteger("1");
				for(int i = 0; i < b; i++){
					tempNum = tempNum.multiply(new BigInteger("" + a));
				}
				combinations.add(tempNum);
			}
		}
		
		System.out.println(combinations.size());
		
		ArrayList<BigInteger> distinctTerms = new ArrayList<BigInteger>();
		
		for(int i = 0; i < combinations.size(); i++){
			boolean distinct = true;
			for(int j = 0; j < distinctTerms.size(); j++){
				if(combinations.get(i).equals(distinctTerms.get(j))){
					distinct = false;
				}
			}
			if(distinct){
				distinctTerms.add(combinations.get(i));
			}
		}
		
		System.out.println("Time elapsed: " + (System.currentTimeMillis() - startTime) + "ms");
		System.out.println("Solution to Project Euler problem 29: " + distinctTerms.size());
	}
}