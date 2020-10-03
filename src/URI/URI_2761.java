package URI;

import java.util.Locale;
import java.util.Scanner;

public class URI_2761 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		float f = sc.nextFloat();
		char ch = sc.next().charAt(0);			
		String[] fields = sc.nextLine().split("");
		String str = "";
		
		for (int i = 1; i < fields.length; i++) {
			str += fields[i];
		}		
				
		System.out.printf("%d%.6f%c%s%n", n, f, ch, str);
		System.out.printf("%d\t%.6f\t%c\t%s%n", n, f, ch, str);
		System.out.printf("%10d%10.6f%10c%10s\n",n , f, ch, str);		
		
		sc.close();

	}

}
