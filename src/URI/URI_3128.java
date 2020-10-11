package URI;

import java.util.Scanner;

public class URI_3128 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		int age1 = sc.nextInt();
		int age2 = sc.nextInt();
		
		if (age1 >= 6 && age2 >= 6) {
			if (age1 >= 14 && age2 >= 14 || age1 >= 18 || age2 >= 18) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
		else {
			System.out.println("NO");
		}		
		
		sc.close();
	}
}