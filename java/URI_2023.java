package URI;

import java.util.Scanner;

public class URI_2023 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		String str = "";
		String name;
		while (sc.hasNext()) {
			name = sc.nextLine();	
			if (name.compareToIgnoreCase(str) > 0) {
				str = name;
			}
		}
		
		System.out.println(str);
		
		sc.close();
	}
}