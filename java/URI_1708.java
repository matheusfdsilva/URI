package URI;

import java.util.Scanner;

public class URI_1708 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();		
		
		double temp = y - x;		
		int laps = (int) Math.ceil(y / temp);	
		
		System.out.println(laps);
		
		sc.close();
	}
}