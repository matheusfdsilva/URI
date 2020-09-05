package URI;

import java.util.Scanner;

public class URI_2922 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			int b = sc.nextInt();
			int u = sc.nextInt();
			
			int rooms = 0;			
			if (b != u) {
				rooms = Math.abs(b - u) - 1;
			}
			
			System.out.println(rooms);
		}
		
		sc.close();
	}
}