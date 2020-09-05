package URI;

import java.util.Scanner;

public class URI_1216 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int friends = 0;
		double fullDistance = 0;		
		
		while (sc.hasNext()) {
			sc.nextLine();
			int distance = sc.nextInt();
			friends++;	
			fullDistance += distance;
			
			sc.nextLine();
		}
		
		double avgDistance = fullDistance / friends;
		System.out.printf("%.1f\n", avgDistance);
		
		sc.close();
	}
}
