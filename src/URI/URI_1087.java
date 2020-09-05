package URI;

import java.util.Scanner;

public class URI_1087 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2= sc.nextInt();
		int y2= sc.nextInt();
		
		while (x1 != 0 && y1 != 0 && x2 != 0 && y2 != 0) {
			if (x2 - x1 == 0 & y2 - y1 == 0)
				System.out.println(0);
			
			else if (Math.abs(x2 - x1) == Math.abs(y2 - y1) || x2 == x1 || y2 == y1)
				System.out.println(1);
			
			else System.out.println(2);
			
			x1 = sc.nextInt();
			y1 = sc.nextInt();
			x2= sc.nextInt();
			y2= sc.nextInt();
		}
		
		
		sc.close();
	}
}
