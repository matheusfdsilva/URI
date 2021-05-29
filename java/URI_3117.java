package URI;

import java.util.Scanner;

public class URI_3117 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int minPresentes = sc.nextInt();
		int presentes = 0;
		
		for (int i = 0; i < n; i++) {
			int horarioChegada = sc.nextInt();
			if (horarioChegada <= 0) presentes++;
			if (presentes >= minPresentes) break;
		}
		
		if (presentes >= minPresentes) System.out.println("YES");
		else System.out.println("NO");
		
		sc.close();
	}
}
