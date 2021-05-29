package URI;

import java.util.Scanner;

public class URI_3174 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int b = 0, a = 0, m = 0, d = 0;
		
		
		for (int i = 0; i < n; i++) {
			sc.next();
			String job = sc.next();
			int h = sc.nextInt();
			if (job.equals("bonecos")) {
				b += h;
			}
			else if (job.equals("arquitetos")) {
				a += h;
			}
			else if (job.equals("musicos")) {
				m += h;
			}
			else {
				d += h;
			}
		}
		
		int toys = b / 8 + a / 4 + m / 6 + d / 12;
		System.out.println(toys);				
		
		sc.close();		
	}
}
