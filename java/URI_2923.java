package URI;

import java.util.Scanner;

public class URI_2923 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int size, usedSize, warning, critical;
		
		while (sc.hasNext()) {
			size = sc.nextInt();
			usedSize = sc.nextInt();
			warning = sc.nextInt();
			critical = sc.nextInt();
			
			double percentUsed = (double) usedSize / size * 100.0;
			if (percentUsed >= critical) System.out.println("critical");
			else if (percentUsed >= warning) System.out.println("warning");
			else System.out.println("OK");
		}		
		
		sc.close();
	}
}