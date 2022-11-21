public class Euler009{
	public static void main(String[] args){
		long startTime = System.currentTimeMillis();
		
		for(int a = 1; a < 1000; a++){
			for(int b = 1; b < (1000 - a); b++){
				int c = (1000 - a - b);
				
				if((a * a + b * b) == (c * c)){
					System.out.println("[" + (System.currentTimeMillis() - startTime) + "ms] Solution #9: " + a * b * c);
                    System.exit(0);
				}
			}
		}
	}
}