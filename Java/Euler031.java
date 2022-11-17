public class Euler031 {
    public static int[] coins = {200, 100, 50, 20, 10, 5, 2, 1};
    public static final int TARGET = 200;
    public static void main(String[] args){
        long startTime = System.currentTimeMillis();

        int solution = coinRecursion(0, 0);
        System.out.println("Time elapsed: " + (System.currentTimeMillis() - startTime) + "ms");
        System.out.println("Solution to Project Euler problem 31: " + solution);
    }

    public static int coinRecursion(int num, int index){
        if(index == 7){
            return 1;
        }
        else if(num == TARGET){
            return 1;
        }
        else{
            int sum = 0;
        for(int i = 0; i <= ((TARGET - num) / coins[index]); i++){
            sum += coinRecursion(num + i * coins[index], index + 1);
        }
        return sum;
        }
    }
}
