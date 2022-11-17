public class Euler055 {
    public static void main(String[] args){

    }

    public static boolean isPalindrome(int num){
		String number = Integer.toString(num);
		char[] numberArray = number.toCharArray();
		for(int i = 0; i < numberArray.length; i++){
			if(!(numberArray[i] == numberArray[numberArray.length - 1 - i])){
				return false;
			}
		}
		return true;
	}
}
