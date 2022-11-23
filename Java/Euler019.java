import java.util.*;

public class Euler019 {
    public static void main(String[] args){
        long startTime = System.currentTimeMillis();

        GregorianCalendar c = new GregorianCalendar();
        c.set(1901, 1, 1);

        int count = 0;
        while(c.get(Calendar.YEAR) <= 2000){
            if(c.get(Calendar.DAY_OF_MONTH) == 1 && c.get(Calendar.DAY_OF_WEEK) == 1){
                count++;
            }
            
            c.add(Calendar.DAY_OF_MONTH, 1);
        }

        System.out.println("[" + (System.currentTimeMillis() - startTime) + "ms] Solution #16: " + count);
    }
}
