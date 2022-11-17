public class Euler009{
	public static void main(String[] args){
		long startTime = System.currentTimeMillis();
		
		int abc = 0;
		
		for(int a = 1; a < 1000; a++){
			for(int b = 1; b < (1000 - a); b++){
				int c = (1000 - a - b);
				
				if((a * a + b * b) == (c * c)){
					abc = a * b * c;
				}
			}
		}

        System.out.println("Time elapsed: " + (System.currentTimeMillis() - startTime) + "ms");
		System.out.println("Solution to Project Euler problem 9: " + abc);
	}
}