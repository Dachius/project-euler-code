import java.util.*;

public class Euler024 {
    public static void main(String[] args){
		long startTime = System.currentTimeMillis();
		
		List<String> permutations = new ArrayList<>();
        char[] pieces = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        recur(permutations, pieces, "");

		
		System.out.println("[" + (System.currentTimeMillis() - startTime) + "ms] Solution #24: " + permutations.get(999999));
    }

    public static void recur(List<String> permutations, char[] pieces, String building){
        if(pieces.length == 0){
            permutations.add(building);
            return;
        }

        for(int i = 0; i < pieces.length; i++){
            recur(permutations, removeAt(pieces, i), building + pieces[i]);
        }
    }

    public static char[] removeAt(char[] charArray, int index){
		char[] toReturn = new char[charArray.length - 1];

		int toSubtract = 0;

		for(int i = 0; i < charArray.length; i++){
			if(i != index){
				toReturn[i - toSubtract] = charArray[i];
			}
			else{
				toSubtract++;
			}
		}

		return toReturn;
	}
}