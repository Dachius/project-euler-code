import java.util.*;
import java.math.*;

public class Euler029{
	public static void main(String[] args){
		long startTime = System.currentTimeMillis();
        
		HashSet<BigInteger> nums = new HashSet<>();
		
		for(int a = 2; a <= 100; a++){
			for(int b = 2; b <= 100; b++){
				BigInteger tempNum = new BigInteger(Integer.toString(a)).pow(b);
				nums.add(tempNum);
			}
		}
		
		System.out.println("[" + (System.currentTimeMillis() - startTime) + "ms] Solution #29: " + nums.size());
	}
}