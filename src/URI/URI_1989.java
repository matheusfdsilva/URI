package URI;

import java.util.Scanner;

public class URI_1989 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		while (x != - 1 && y != - 1) {	
			sc.nextLine();			
			String[]fields = sc.nextLine().split(" ");
			
			long minutes = 0;
			for (int i = 0; i < fields.length; i++) {				
				minutes += Long.parseLong(fields[i]) * y * (x - i);				
			}
			
			System.out.println(minutes);
			
			x = sc.nextInt();
			y = sc.nextInt();
		}
		
		sc.close();
	}
}