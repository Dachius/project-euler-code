public class Euler040{
	public static void main(String[] args){
		long startTime = System.currentTimeMillis();
		String concat = "";
		for(int i = 1; concat.length() < 1000000; i++){
			concat += i;
		}
		
		long mult = 1;
		
		for(int i = 0; i <= 6; i++){
			mult *= Integer.parseInt("" + concat.charAt((int)Math.pow(10, i) - 1));
		}
		
		System.out.println("Time elapsed: " + (System.currentTimeMillis() - startTime) + "ms");
		System.out.println("Solution to Project Euler problem 40: " + mult);
	}
}