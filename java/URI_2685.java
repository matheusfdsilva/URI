package URI;

import java.util.Scanner;

public class URI_2685 {
	
	public static String msg = null;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			int n = sc.nextInt();
			System.out.println(msg(n));
		}
		
		sc.close();

	}
	private static String msg(int n) {
		if (n >= 0 && n < 90 || n == 360) return "Bom Dia!!";
		if (n >= 90 && n < 180) return "Boa Tarde!!";
		if (n >= 180 && n < 270) return "Boa Noite!!";
		return "De Madrugada!!";		
	}
}