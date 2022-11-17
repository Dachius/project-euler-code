import java.math.*;
import java.util.*;

public class Euler025{
	public static void main(String[] args){
		long startTime = System.currentTimeMillis();
		
		ArrayList<BigInteger> bigInts = new ArrayList<BigInteger>();
		
		bigInts.add(new BigInteger("1"));
		bigInts.add(new BigInteger("1"));
		
		for(int i = 2; bigInts.get(bigInts.size() - 1).toString().length() < 1000; i++){
			bigInts.add(bigInts.get(i - 1).add(bigInts.get(i - 2)));
		}
		
		System.out.println("Time elapsed: " + (System.currentTimeMillis() - startTime) + "ms");
		System.out.println("Solution to Project Euler problem 25: " + (bigInts.size()));
	}
}