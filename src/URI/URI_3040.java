package URI;

import java.util.Scanner;

public class URI_3040 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			int h = sc.nextInt();
			int d = sc.nextInt();
			int g = sc.nextInt();
			
			if(canChoice(h, d, g)) System.out.println("Sim");
			else System.out.println("Nao");			
		}		
		
		sc.close();
	}
	public static boolean canChoice(int a, int b, int c) {
		if (a >= 200 && a <= 300 && b >= 50 && c >= 150) return true;
		
		return false;
	}
}
