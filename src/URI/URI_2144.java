package URI;

import java.util.Scanner;

public class URI_2144 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int w1 = sc.nextInt();
		int w2 = sc.nextInt();
		int r = sc.nextInt();
		
		double right, left, media, sum = 0;
		int casos = 0;		
		
		while (w1 != 0 && w2 != 0 && r != 0) {
			right = w1 * (1 + r / 30.0);
			left = w2 * (1 + r / 30.0);
			media = (right + left) / 2;
			
			if (media > 60) System.out.println("AQUI E BODYBUILDER!!");
			else if (media >= 40) System.out.println("Ta saindo da jaula o monstro!");
			else if (media >= 14) System.out.println("Bora, hora do show! BIIR!");
			else if (media < 13) System.out.println("Nao vai da nao");
			else System.out.println("E 13");			
			
			casos++;
			sum += media;
			w1 = sc.nextInt();
			w2 = sc.nextInt();
			r = sc.nextInt();
		}
				
		if (sum / casos > 40) {
			System.out.println();
			System.out.println("Aqui nois constroi fibra rapaz! Nao e agua com musculo!");
		}
		
		sc.close();
	}	
}