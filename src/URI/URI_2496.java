package URI;

import java.util.Scanner;

public class URI_2496 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			int l = sc.nextInt();
			String str = sc.next();
			String correctOrder = createOrder(l);
			if (!correctOrder.equals(str)) {
				int contDif = 0;
				for (int k = 0; k < l; k++) {
					if (str.charAt(k) != correctOrder.charAt(k)) {
						contDif++;
					}
				}
								
				System.out.println(contDif <= 2 ? "There are the chance." : "There aren't the chance.");
			}
		}
		
		sc.close();		
	}

	private static String createOrder(int l) {
		String str = "";
		for (char ch = 'A', i = 0; i < l; ch++, i++) {
			str += ch;
		}
		return str;
	}	
}