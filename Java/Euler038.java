import java.util.*;

/*
 * Concept taken from various sources.
 * Gamma in the Project Euler forumns noted that this problem was solvable by hand, and that the
 * example in the question of 918273645 implies that any superior starting number must start with 9.
 * I couldn't see a clean way to implement this idea.
 */
public class Euler038 {
    public static void main(String[] args){
        long startTime = System.currentTimeMillis();

        int max = 0;
        for(int n = 2; n <= 9; n++){
            outer: for(int i = 1; true; i++){
                String concat = "";

                for(int j = 1; j <= n; j++){
                    concat += i * j;
                    if(concat.length() > 9){
                        break outer;
                    }
                }

                if(isPandigital(concat)){
                    max = Math.max(Integer.parseInt(concat), max);
                }
            }
        }

        System.out.println("[" + (System.currentTimeMillis() - startTime) + "ms] Solution #38: " + max);
    }

	public static boolean isPandigital(String s){
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars).equals("123456789");
    }
}