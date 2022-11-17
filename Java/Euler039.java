public class Euler039{
	public static void main(String[] args){
		long startTime = System.currentTimeMillis();
		
		int highestP = 0; 
		int highestNum = 0;
		
		for(int p = 0; p <= 1000; p++){
			int solutionCount = 0;
			
			for(int a = 0; a < p; a++){
				for(int b = 0; b <= a; b++){
					if((Math.floor(Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2))) == Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2))) && (a + b + (int)Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2))) == p){
						solutionCount++;
					}
				}
			}
			
			if(solutionCount > highestNum){
				highestP = p;
				highestNum = solutionCount;
			}
		}
		
		System.out.println("Time elapsed: " + (System.currentTimeMillis() - startTime) + "ms");
		System.out.println("Solution to Project Euler problem 39: " + highestP);
	}
}