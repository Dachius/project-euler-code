public class Euler052 {
    public static void main(String[] args){
        long startTime = System.currentTimeMillis();

        for(int i = 1; true; i++){
            boolean solution = true;
            for(int j = 2; j <= 7; j++){
                if(!anagrams(i, i * j)){
                    solution = false;
                }
            }

            if(solution){
                System.out.println("Time elapsed: " + (System.currentTimeMillis() - startTime) + "ms");
                System.out.println("Solution to Project Euler problem 52: " + i);
                System.exit(0);
            }
        }
    }

    public static boolean anagrams(int i1, int i2){
        return anagrams("" + i1, "" + i2);
    }

    public static boolean anagrams(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }

        char[] array1 = s1.toCharArray();
        char[] array2 = s2.toCharArray();

        for(int i = 0; i < array1.length; i++){
            for(int j = 0; j < array2.length; j++){
                if(array1[i] == array2[j]){
                    array1 = removeAt(array1, i);
                    i--;
                    array2 = removeAt(array2, j);
                    break;
                }
            }
        }

        return (array1.length == 0);
    }

    //Returns a char[] which is the input char[] but with the character at an indicated index removed
	public static char[] removeAt(char[] charArray, int index){
		char[] toReturn = new char[charArray.length - 1];

		//toSubtract serves to have the index characters are being taken from charArray increase by 1, in order to correctly skip over the character at index
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
