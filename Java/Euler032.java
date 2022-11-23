import java.util.*;

public class Euler032 {
    public static void main(String[] args){
        long startTime = System.currentTimeMillis();

        List<String> pandigitals = new ArrayList<>();
        char[] pieces = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};
        recur(pandigitals, pieces, "");

        HashSet<Integer> products = new HashSet<>();

        for(int i = 0; i < 5; i++){
            for(int j = i + 1; j < 8; j++){
                for(int k = 0; k < pandigitals.size(); k++){
                    if(Integer.parseInt(pandigitals.get(k).substring(0, i + 1)) * Integer.parseInt(pandigitals.get(k).substring(i + 1, j + 1)) == Integer.parseInt(pandigitals.get(k).substring(j + 1, 9))){
                        products.add(Integer.parseInt(pandigitals.get(k).substring(j + 1, 9)));
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
