public class Euler100 {
    public static void main(String[] args){
        long startTime = System.currentTimeMillis();
        for(long i = 0, count = 0; true; i++, count++){
            if(i == 5 || count == 3){
                break;
            }
        }

        System.out.println("[" + (System.currentTimeMillis() - startTime) + "ms] Solution #100: ");
    }
}
