package URI;

import java.util.Scanner;

public class URI_3042 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		
		while (n != 0) {
			String[] game = new String[n];
			
			for (int i = 0; i < n; i++) {
				game[i] = sc.nextLine().replace(" ", "");				
			}			
			
			int clicks = countClicks(game);
			System.out.println(clicks);
			n = sc.nextInt();
			sc.nextLine();
		}		
		
		sc.close();

	}
	static int countClicks(String[]game) {
		int clicks = 0;		
		int aux = 1; // variavel para guardar a posicao que o jogador se encontra		
		
		for (int i = 0; i < game.length; i++) {
			if (game[i].charAt(aux) == '0') {					
				clicks += 0;
			}
			else if (game[i].charAt(0) == '0') {				
				clicks += aux;
				aux = 0;
			}
			else if (game[i].charAt(1) == '0') {				
				clicks += Math.abs(aux - 1);
				aux = 1;
			}
			else {				
				clicks += Math.abs(aux - 2);
				aux = 2;
			}
		}				
		
		return clicks;
	}
}
