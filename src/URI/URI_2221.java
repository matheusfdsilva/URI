package URI;

import java.util.Scanner;

public class URI_2221 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();		
		
		for (int i = 0; i < n; i++) {
			double golpeDabriel = 0;
			double golpeGuarte = 0;
			
			int bonus = sc.nextInt();
			int ataqDabriel = sc.nextInt();
			int defDabriel = sc.nextInt();
			int levelDabriel = sc.nextInt();
			
			if (levelDabriel % 2 == 0) 	golpeDabriel = (ataqDabriel + defDabriel) / 2.0 + bonus;
			else golpeDabriel = (ataqDabriel + defDabriel) / 2.0;
			
			int ataqGuarte = sc.nextInt();
			int defGuarte = sc.nextInt();
			int levelGuarte = sc.nextInt();
			
			if (levelGuarte % 2 == 0) 	golpeGuarte = (ataqGuarte + defGuarte) / 2.0 + bonus;
			else golpeGuarte = (ataqGuarte + defGuarte) / 2.0;			
			
			if (golpeDabriel == golpeGuarte) System.out.println("Empate");
			else if (golpeDabriel > golpeGuarte) System.out.println("Dabriel");
			else System.out.println("Guarte");
		}		
		
		sc.close();

	}
}
