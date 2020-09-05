package URI;

import java.util.Scanner;

public class URI_1244 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < n; i++) {			
			String[] fields;			
			fields = sc.nextLine().split(" ");
			
			String newString = ordenedString(fields);
			System.out.println(newString);
		}			
		
		sc.close();
	}
	static String ordenedString(String[]fields) {		
		for (int x = 0; x < fields.length; x++) {
			for (int j = 1; j < fields.length; j++) {
				if (fields[j].length() > fields[j-1].length()) {
					String aux = fields[j-1];
					fields[j-1] = fields[j];
					fields[j] = aux;
				}
			}
		}
		String newString = "";
		
		for (int x = 0; x < fields.length; x++) {
			newString += fields[x] + " ";
		}
		return newString.trim();
	}
}
