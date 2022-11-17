import java.util.*;

public class Euler011{
	public static void main(String[] args){
		String num = "08022297381500400075040507785212507791084949994017811857608717409843694804566200814931735579142993714067538830034913366552709523046011426924685601325671370236912231167151676389419236542240402866331380244732609903450244753353783684203517125032988128642367102638406759547066183864706726206802621220956394396308409166499421245558056673992697177878968314883489637221362309750076442045351400613397343133957817532822753167159403800462161409535692163905429635314755588824001754243629855786560048357189070544443744602158515417581980816805944769287392138652177704895540045208839735991607975732162626793327986688366887576220720346336746551232639353690442167338253911249472180846293240627636206936417230238834629969826759857404361620733529783190017431497148868116235705540170547183515469169233486143520189196748";
		int[][] cells = new int[20][20];
		
		ArrayList<Long> products = new ArrayList<Long>();
		
		for(int i = 0; i < 20; i++){
			for(int j = 0; j < 20; j++){
				cells[i][j] = Integer.parseInt(num.substring((20 * 2 * i + 2 * j), (20 * 2 * i + 2 * j + 2)));
			}
		}
		
		//Horizontal Products
		
		for(int i = 0; i < 20; i++){
			for(int j = 0; j < 17; j++){
				
				long mult = 1;
				for(int k = 0; k < 4; k++){
					mult *= cells[i][j + k];
				}
				
				products.add(mult);
			}
		}
		
		//Vertical Products
		
		for(int i = 0; i < 17; i++){
			for(int j = 0; j < 20; j++){
				
				long mult = 1;
				for(int k = 0; k < 4; k++){
					mult *= cells[i + k][j];
				}
				
				products.add(mult);
			}
		}
		
		//Diagonal Down-right Products
		
		for(int i = 0; i < 17; i++){
			for(int j = 0; j < 17; j++){
				
				long mult = 1;
				for(int k = 0; k < 4; k++){
					mult *= cells[i + k][j + k];
				}
				
				products.add(mult);
			}
		}
		
		//Diagonal Down-left Products
		
		for(int i = 0; i < 17; i++){
			for(int j = 3; j < 20; j++){
				
				long mult = 1;
				for(int k = 0; k < 4; k++){
					mult *= cells[i + k][j - k];
				}
				
				products.add(mult);
			}
		}
		
		long largestProduct = Long.MIN_VALUE;
		for(int i = 0; i < products.size(); i++){
			if(products.get(i) > largestProduct){
				largestProduct = products.get(i);
			}
		}
		
		System.out.println("Solution to Project Euler problem 11: " + largestProduct);
	}
}