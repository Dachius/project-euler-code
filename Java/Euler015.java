public class Euler015{
	public static void main(String[] args){
        long startTime = System.currentTimeMillis();
		
		long[][] cells = new long[21][21];
		
		for(int i = 0; i < 21; i++){
			cells[0][i] = 1;
			cells[i][0] = 1;
		}
		
		for(int i = 1; i < 21; i++){
			for(int j = 1; j <= i; j++){
				cells[i - j + 1][j] = cells[i - j][j] + cells[i - j + 1][j - 1];
			}
		}
		
		int i = 20, j = 2, jSave = 2;
		
		while(cells[20][20] == 0){
			while(j < 21){
				cells[i][j] = cells[i - 1][j] + cells[i][j - 1];
				j++;
				i--;
			}
			i = 20;
			jSave++;
			j = jSave;
		}
		
		System.out.println("[" + (System.currentTimeMillis() - startTime) + "ms] Solution #15: " + cells[20][20]);
	}
}