package URI;

import java.util.Scanner;

public class URI_2150 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String a = sc.next();
			sc.nextLine();
			String b = sc.nextLine();
			int count = 0;
						
			for (char ch : b.toCharArray()) {
				if (a.contains(ch+"")) count++;
			}
			System.out.println(count);
		}
		
		sc.close();
	}
}