package URI;

import java.util.Scanner;

public class URI_2722 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < n; i++) {
			String a = sc.nextLine();
			String b = sc.nextLine();
						
			StringBuilder name = new StringBuilder();
			int start = 0;
			int end = 2;
						
			while (end <= b.length()) {						
				makeName(a, name, start, end);
				makeName(b, name, start, end);
				start += 2;
				end += 2;
			}
			
			if (b.length() % 2 != 0) {
				makeName(a, name, start, end);
				name.append(b.charAt(b.length()-1));				
			}
			
			System.out.println(name.toString());
		}
		
		sc.close();
	}

	private static void makeName(String a, StringBuilder name, int start, int end) {
		name.append(a.substring(start, end));		
	}
}