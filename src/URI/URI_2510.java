package URI;

import java.util.Scanner;

public class URI_2510 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			String vilao = sc.next();
			if (!vilao.equals("Batmain")) System.out.println("Y");
			else System.out.println("N");
		}
		
		sc.close();

	}

}
