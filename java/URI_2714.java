package URI;

import java.util.Scanner;

public class URI_2714 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			String id = sc.next();
			
			if (id.length() == 20 && id.startsWith("RA")) {
				long password = Long.parseLong(id.substring(2));
				System.out.println(password);
			}
			else System.out.println("INVALID DATA");
		}		
		
		sc.close();
	}
}