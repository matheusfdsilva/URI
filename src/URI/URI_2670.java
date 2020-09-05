package URI;

import java.util.Scanner;

public class URI_2670 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
						
		int minA = 0, minB = 0, minC = 0;
		minA = b * 2 + c * 4;
		minB = a * 2 + c * 2;
		minC = a * 4 + b * 2;
		
		int min = 0;
		if (minA < minB && minA < minC) min = minA;
		else if (minB < minC) min = minB;
		else min = minC;
				
		System.out.println(min);
		
		sc.close();
	}
}
