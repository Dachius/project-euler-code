import java.util.*;

public class Euler032 {
    public static void main(String[] args){
        long startTime = System.currentTimeMillis();

        List<String> pandigitals = new ArrayList<>();
        Character[] vals = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};
        recur(pandigitals, Arrays.asList(vals), "");

        HashSet<Integer> products = new HashSet<>();

        for(int i = 0; i < 5; i++){
            for(int j = i + 1; j < 8; j++){
                for(String s : pandigitals){
                    if(Integer.parseInt(s.substring(0, i + 1)) * Integer.parseInt(s.substring(i + 1, j + 1)) == Integer.parseInt(s.substring(j + 1, 9))){
                        products.add(Integer.parseInt(s.substring(j + 1, 9)));
                    }
                }
            }
        }

        long sum = 0;
        for(Integer n : products){
            sum += n;
        }

        System.out.println("[" + (System.currentTimeMillis() - startTime) + "ms] Solution #32: " + sum);
    }

    public static void recur(List<String> permutations, List<Character> pieces, String building){
        if(pieces.size() == 0){
            permutations.add(building);
        } else{
            for(Character c : pieces){
                List<Character> pieceClone = new ArrayList<>(pieces);
                pieceClone.remove(c);
                recur(permutations, pieceClone, building + c);
            }
        }
    }
}
