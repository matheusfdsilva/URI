package URI;

import java.util.Scanner;

public class URI_1507 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			String string = sc.next();
			int x = sc.nextInt();
			for (int j = 0; j < x; j++) {
				String query = sc.next();
				String subsequency = "";
				int aux = 0;
				for (char ch : string.toCharArray()) {
					if (aux < query.length() && ch == query.charAt(aux)) {
						subsequency += ch;
						aux++;
					}
				}
				
				System.out.println(subsequency.equals(query) ? "Yes" : "No");
			}
		}
		
		sc.close();
	}
}
