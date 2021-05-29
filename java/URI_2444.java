package URI;

import java.util.Scanner;

public class URI_2444 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int v = sc.nextInt();
		int t = sc.nextInt();
		
		for (int i = 0; i < t; i++) {
			int action = sc.nextInt();
			int aux = v + action;
			if (aux <= 100 && aux >= 0) {
				v += action;
			}
			else if (aux > 100) {
				v = 100;
			}
			else {
				v = 0;
			}
		}
		System.out.println(v);
		
		sc.close();
	}
}