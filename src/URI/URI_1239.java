package URI;

import java.util.Scanner;

public class URI_1239 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			
			String st = sc.nextLine();
			StringBuilder sb = new StringBuilder();
			int italic = 0;
			int bold = 0;
			
			for (int i = 0; i < st.length(); i++) {
				char ch = st.charAt(i);
				if (ch == '_') {
					if (italic % 2 == 0) sb.append("<i>");
					else sb.append("</i>");
					italic++;
				}
				else if (ch == '*') {
					if (bold % 2 == 0) sb.append("<b>");
					else sb.append("</b>");
					bold++;
				}
				else sb.append(ch);
			}
			
			System.out.println(sb.toString());			
		}		
		
		sc.close();
	}
}
