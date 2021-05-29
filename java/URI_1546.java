package URI;

import java.util.Scanner;

public class URI_1546 {

	private static final String[] names = {"Rolien", "Naej", "Elehcim", "Odranoel"};
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			int feedbacks = sc.nextInt();
			for (int k = 0; k < feedbacks; k++) {
				int id = sc.nextInt();
				System.out.println(names[id-1]);
			}
		}		
		
		sc.close();
	}
}