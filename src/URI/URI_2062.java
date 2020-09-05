package URI;

import java.util.Scanner;

public class URI_2062 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String str = "";
		for (int i = 0; i < n; i++) {
			String st = sc.next();			
			if (st.length() == 3 && (st.startsWith("OB") || st.startsWith("UR"))) {
				str += st.substring(0, 2) + "I ";
			}
			else str += st + " ";						
		}
		
		System.out.println(str.trim());		
		
		
		sc.close();
	}
}