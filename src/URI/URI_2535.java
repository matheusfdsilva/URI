package URI;

import java.util.Scanner;

public class URI_2535 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int filhotes = 0;
			sc.nextLine();
			for (int i = 0; i < n ; i++) {
				String tipo = sc.nextLine();
				String raca = sc.nextLine();
				String name = sc.nextLine();
				
				if (tipo.equals("cachorro") && name.contains(" ")) {
					String[]names = name.split(" ");
					char start = raca.charAt(0);
					for (int j = 0; j < names.length; j++) {
						if (names[j].startsWith(start+"")) {
							filhotes++;
							break;
						}
					}
				}
				sc.nextLine();
			}
			
			System.out.println(filhotes);
		}		
		
		sc.close();
	}
}