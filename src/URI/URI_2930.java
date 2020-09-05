package URI;

import java.util.Scanner;

public class URI_2930 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int e = sc.nextInt();
		int d = sc.nextInt();
		
		if (e > d) System.out.println("Eu odeio a professora!");
		else if (d - e >= 3) System.out.println("Muito bem! Apresenta antes do Natal!");
		else {
			System.out.println("Parece o trabalho do meu filho!");
			if (e + 2 < 24) System.out.println("TCC Apresentado!");
			else System.out.println("Fail! Entao eh nataaaaal!");
		}			
		
		sc.close();
	}
}
