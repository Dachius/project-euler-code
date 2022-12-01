import java.util.*;

public class Euler024 {
    public static void main(String[] args){
		long startTime = System.currentTimeMillis();
		
		List<String> permutations = new ArrayList<>();
        Character[] pieces = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        recur(permutations, Arrays.asList(pieces), "");

		
		System.out.println("[" + (System.currentTimeMillis() - startTime) + "ms] Solution #24: " + permutations.get(999999));
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