package URI;

import java.util.Scanner;

public class URI_2157 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			for (int k = x; k <= y; k++) {
				sb.append(k);
			}
			System.out.print(sb.toString());
			System.out.println(sb.reverse());
			sb.delete(0, sb.length());
		}		
		
		sc.close();
	}
}