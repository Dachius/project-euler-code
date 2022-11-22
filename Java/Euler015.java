public class Euler015{
	public static void main(String[] args){
        long startTime = System.currentTimeMillis();
		
        // There grid is "actually" 21x21, because we're using the intersections of the borders, not the squares themselves.
		long[][] cells = new long[21][21];
		for(int i = 0; i < 21; i++){
			cells[0][i] = 1;
			cells[i][0] = 1;
		}
		
		for(int i = 1; i < 21; i++){
            for(int j = 1; j < 21; j++){
                cells[i][j] = cells[i][j - 1] + cells[i - 1][j];
            }
        }
		
		System.out.println("[" + (System.currentTimeMillis() - startTime) + "ms] Solution #15: " + cells[20][20]);
	}
}