package URI;

import java.util.Scanner;

public class URI_1581 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			String[] idiomas = new String[x];
			for (int l = 0; l < x; l++) {
				idiomas[l] = sc.next();
			}
			
			if (checkIdioma(idiomas)) System.out.println(idiomas[0]);
			else System.out.println("ingles");
		}
		
		sc.close();
	}
	
	public static boolean checkIdioma(String[]x) {
		boolean status = false;
		for (int i = 1; i < x.length; i++) {
			if (x[i].equals(x[i-1])) status = true;
			else return status = false;
		}
		return status;
	}
}
