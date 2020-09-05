package URI;

import java.util.Scanner;

public class URI_2981 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		long c = sc.nextLong();
		long g = sc.nextLong();
		
		long close = c / g + 21;		
		
		if (close <= 30) {
			System.out.println("A UFSC fecha dia " + close + " de setembro.");
		} else {
			close -= 30;
			System.out.println("A UFSC fecha dia " + close + " de outubro.");
		}
		
		
		sc.close();
	}
}