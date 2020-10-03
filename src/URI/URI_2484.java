package URI;

import java.util.Scanner;

public class URI_2484 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		while (sc.hasNext()) {
			String str = sc.next();	
			sb.append(str);
			String[][] magic = new String[str.length()][str.length()];
			for (int i = 0; i < str.length(); i++) {
				for (int j = 0; j < str.length(); j++) {
					if (sb.charAt(j) != ' ') {
						magic[i][j] = sb.charAt(j)+"";
					}
				}
				sb.insert(0, " ");
			}
			
			sb.delete(0, sb.length());
			
			for (int i = 0; i < str.length(); i++) {
				for (int j = 0; j < str.length(); j++) {
					if (magic[i][j] != null) {
						sb.append(magic[i][j]);						
					}
					if (j < str.length()-1) {
						sb.append(" ");						
					}
					else {
						sb.append("\n");
					}					
				}				
			}
			System.out.println(sb.toString());			
			sb.delete(0, sb.length());
		}		
		
		sc.close();
	}
}