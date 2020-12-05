package URI;

import java.util.Scanner;

public class URI_1787 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		while (n != 0) {
			int[] vect = new int[3];			
			for (int j = 0; j < n; j++) {
				int maiorPow = 0;
				int maiorRound = 0;
				int indexMaior = 0;
				for (int i = 0; i < 3; i++) {
					int value = sc.nextInt();
					if (isPowTwo(value)) {
						if (value > maiorPow) {
							maiorPow = value;
							indexMaior = i;
						}
						vect[i] += 1;
					}	
					if (value > maiorRound) {
						maiorRound = value;
					}
				}	
				if (maiorPow == maiorRound) {
					vect[indexMaior] += 1;
				}
			}			
				
			int cod = winner(vect);
			
			switch (cod) {
			case 0:
				System.out.println("Uilton");
				break;
			case 1:
				System.out.println("Rita");
				break;
			case 2:
				System.out.println("Ingred");
				break;
			case 3:
				System.out.println("URI");
				break;
			}				
			
			n = sc.nextInt();
		}
		
		sc.close();
	}
		
	private static int winner(int[] vect) {
		int maior = vect[0];
		int index = 0;
		int aux = 1;
		for (int i = 1; i < vect.length; i++) {			
			if (vect[i] > maior) {
				maior = vect[i];
				index = i;
				aux = 1;
			}
			else if (vect[i] == maior) {
				aux++;
			}
		}			
		return aux > 1 ? 3 : index;
	}

	private static boolean isPowTwo(int value) {		
		while (value > 1) {			
			if (value % 2 != 0) {					
				return false;
			}	
			value /= 2;
		}		
		return true;
	}
}