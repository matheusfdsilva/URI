package URI;

import java.util.Scanner;

public class URI_1521 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();				
		
		while (n != 0) {
			sc.nextLine();
			String[]vect = sc.nextLine().split(" ");			
			
			int start = sc.nextInt();
			boolean seEntregou = false;
			int aluno = 0;
			
			while (!seEntregou) {					
				if (vect[start-1].equals(String.valueOf(start))) {
					seEntregou = true;
					aluno = start;
				}
				else {
					start = Integer.parseInt(vect[start-1]);
				}
			}			
			
			System.out.println(aluno);
			n = sc.nextInt();			
		}		
				
		sc.close();
	}
}