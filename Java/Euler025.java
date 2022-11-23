import java.math.*;
import java.util.*;

public class Euler025{
	public static void main(String[] args){
		long startTime = System.currentTimeMillis();
		
		ArrayList<BigInteger> bigInts = new ArrayList<BigInteger>();
		
		bigInts.add(new BigInteger("1"));
		bigInts.add(new BigInteger("1"));
		
        BigInteger breakPoint = new BigInteger("10").pow(999);
		for(int i = 2; bigInts.get(bigInts.size() - 1).compareTo(breakPoint) <= 0; i++){
			bigInts.add(bigInts.get(i - 1).add(bigInts.get(i - 2)));
		}
		
		System.out.println("[" + (System.currentTimeMillis() - startTime) + "ms] Solution #25: " + (bigInts.size()));
	}
}