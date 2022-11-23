import java.util.*;

public class Euler035{
	public static void main(String[] args){
		long startTime = System.currentTimeMillis();
        HashSet<Integer> primes = primeSieve(1000000);

        for(Iterator<Integer> iter = primes.iterator(); iter.hasNext();){
            Integer p = iter.next();
            char[] digits = p.toString().toCharArray();
            for(char c : digits){
                if(c == '0' || c == '2' || c == '4' || c == '5' || c == '6' || c == '8'){
                    iter.remove();
                    break;
                }
            }
        }
		
		int count = 0;
		for(Integer p : primes){
			boolean candidate = true;
            
            String num = Integer.toString(p);

			for(int j = 0; j < num.length(); j++){
				num = num.charAt(num.length() - 1) + num.substring(0, num.length() - 1);
				
				if(!primes.contains(Integer.parseInt(num))){
					candidate = false;
                    break;
				}
			}
			
			if(candidate){
				count++;
			}
		}

        // Remember to count previously excluded 2 and 5.
        count += 2;
		
		System.out.println("[" + (System.currentTimeMillis() - startTime) + "ms] Solution #35: " + count);
	}
	
	// Implement sieve of Eratosthenes
	public static HashSet<Integer> primeSieve(int n){
        HashSet<Integer> primes = new HashSet<Integer>();
        boolean[] nums = new boolean[n + 1];
        for(long i = 2; i < n; i++){
            if(!nums[(int)i]){
                primes.add((int)i);
                for(long j = i * i; j <= n; j += i){
                    nums[(int)j] = true;
                }
            }
        }

        return primes;
    }
}