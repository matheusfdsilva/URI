package URI;

import java.util.Scanner;

public class URI_1091 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int k = sc.nextInt();
		
		while (k != 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			for (int i = 0; i < k; i++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				String regiao = checkRegion(n , m, x, y);
				
				System.out.println(regiao);
			}			
			
			k = sc.nextInt();
		}		
		
		sc.close();
	}

	private static String checkRegion(int n, int m, int x, int y) {
		if (x > n && y > m) {
			return "NE";
		}
		if (x < n && y > m) {
			return "NO";
		}
		if (x < n && y < m) {
			return  "SO";
		}
		if (x > n && y < m) {
			return "SE";
		}
		return "divisa";
	}
}