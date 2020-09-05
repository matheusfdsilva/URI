package URI;

import java.util.Scanner;

public class URI_1332 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			String st = sc.next();				
			if (st.length() == 3 && (st.startsWith("o") || st.endsWith("e"))) System.out.println(1);
			else if (st.length() == 3 && (st.startsWith("t") || st.endsWith("o"))) System.out.println(2);
			else System.out.println(3);
		}		
		
		sc.close();
	}
}