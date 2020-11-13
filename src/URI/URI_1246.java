package URI;

import java.util.Scanner;

public class URI_1246 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			int c = sc.nextInt();
			int n = sc.nextInt();
			int available = c;
			int gain = 0;
			int[] parking = new int[c];
			for (int i = 0; i < n; i++) {
				char status = sc.next().charAt(0);
				int board = sc.nextInt();				
				if (status == 'C') {					
					int sizeCar = sc.nextInt();					
					if (available >= sizeCar) {		
						int count = 0;
						int start = 0;
						for (int s = parking.length-1; s >= 0; s--) { // verificando se há vaga
							if (parking[s] == 0) {
								start = s;
								count++;
							}
							else {								
								count = 0;
							}
							if (count == sizeCar) {
								break;
							}
						}
						if (count == sizeCar) {	// adicionando o carro no estacionamento							
							for (int j = start; j < start + sizeCar; j++) {
								parking[j] = board;									
							}
							gain += 10;
							available -= sizeCar;
						}
					}
				}
				else {	// removendo o carro										
					for (int s = 0; s < parking.length; s++) {						
						if (parking[s] == board) {							
							parking[s] = 0;
							available++;
						}						
					}
				}									
			}
			
			System.out.println(gain);			
		}		
		
		sc.close();
	}	
}