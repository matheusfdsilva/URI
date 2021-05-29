package URI;

import java.util.Scanner;

public class URI_2727 {
	
	public static final String letters = " abcdefghijklmnopqrstuvwxyz";
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			int n = sc.nextInt();
			sc.nextLine();
			for (int i = 0; i < n; i++) {
				int countPoint = 0, countHelper = 0;				
				String points = sc.nextLine();
				for (char ch : points.toCharArray()) {
					if (ch == ' ' && countHelper <= 3) {
						countPoint += 2 / countHelper;
						countHelper = 0;
					}					
					else {
						countPoint++;
						countHelper++;
					}
				}
									
				char ocult = letters.charAt(countPoint);
				System.out.println(ocult);
			}
		}
		
		sc.close();
	}
}