package URI;

import java.util.Scanner;

public class URI_2760 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String st1 = sc.nextLine();
		String st2 = sc.nextLine();
		String st3 = sc.nextLine();
		
		System.out.printf("%s%s%s%n", st1, st2, st3);
		System.out.printf("%s%s%s%n", st2, st3, st1);
		System.out.printf("%s%s%s%n", st3, st1, st2);
		System.out.printf("%.10s%.10s%.10s%n", st1, st2, st3);		
		
		sc.close();
	}
}
