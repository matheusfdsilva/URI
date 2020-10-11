package URI;

import java.util.Scanner;

public class URI_2724 {
	
	private static final String help = "e1234567890l";
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			if (i > 0) {
				System.out.println();
			}
			
			int t = sc.nextInt();
			String[] fields = new String[t];
			for (int k = 0; k < t; k++) {
				fields[k] = sc.next();
			}
			
			int u = sc.nextInt();
			
			for (int k = 0; k < u; k++) {
				String string = sc.next();
				System.out.println(isSafe(fields, string));
			}			
		}		
		
		sc.close();
	}
	
	public static String isSafe(String[] fields, String string) {		
		for (int i = 0; i < fields.length; i++) {			
			if (string.indexOf(fields[i]) != -1) {				
				int aux = string.indexOf(fields[i]) + fields[i].length();				
				if (aux < string.length()) {
					String temp = string.substring(string.indexOf(fields[i]), aux+1);
					if (!help.contains(temp.charAt(temp.length()-1)+"")) {
						return "Abortar";
					}
				}
				if (aux == string.length()) {
					return "Abortar";
				}
			}
		}
		return "Prossiga";	
	}	
}