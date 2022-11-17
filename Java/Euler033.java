public class Euler033 {
    public static void main(String[] args){
        long startTime = System.currentTimeMillis();

        double denominator = 1;
        for(int i = 10; i < 100; i++){
            for(int j = 10; j < 100; j++){
                int[] iDigits = toDigits(i);
                int[] jDigits = toDigits(j);

                if((((double)iDigits[0] * (double)iDigits[1])/((double)jDigits[0] * (double)jDigits[1]) == (double)i/(double)j)
                 && (i < j)
                 && ((iDigits[0] == jDigits[0]) || (iDigits[0] == jDigits[1]) || (iDigits[1] == jDigits[0]) || (iDigits[1] == jDigits[1]))
                 && ((i % 10 != 0) && (j % 10 != 0))){
                    denominator *= ((double)i/(double)j);
                }
            }
        }

        System.out.println("Time elapsed: " + (System.currentTimeMillis() - startTime) + "ms");
        System.out.println("Solution to Project Euler problem 33: " + Math.ceil(1.0/denominator));
    }

    //Takes an int num, returns an array consisting of its digits at their apporpriate indices
	public static int[] toDigits(int num){
        char[] chars = ("" + num).toCharArray();
        int[] digitArray = new int[chars.length];

        for(int i = 0; i < digitArray.length; i++){
			digitArray[i] = Integer.parseInt("" + chars[i]);
        }
        
        return digitArray;
    }
}
