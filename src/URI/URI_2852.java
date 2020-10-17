package URI;

import java.util.Scanner;

public class URI_2852 {
	
	private static final String LETTERS = "aeiou";
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String key = sc.next();
		
		int n = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			String[] fields = sc.nextLine().split(" ");
			StringBuilder[] keyField = buildField(fields, key);
						
			buildNewMsg(keyField, fields);
			for (int k = 0; k < keyField.length; k++) {
				System.out.print(keyField[k]);
				System.out.print(k < keyField.length -1 ? " " : "\n");
			}			
		}
			
		sc.close();		
	}

	private static void buildNewMsg(StringBuilder[] keyField, String[] fields) {		
		for (int i = 0; i < keyField.length; i++) {
			if (!LETTERS.contains(fields[i].charAt(0)+"")) {
				for (int j = 0; j < fields[i].length(); j++) {
					char newLetter = buildLetter(keyField[i].charAt(j), fields[i].charAt(j));
					keyField[i].setCharAt(j, newLetter);
				}
			}			
		}		
	}

	private static char buildLetter(char charA, char charB) {
		int dif = charB - 'a';
		int posCharA = charA - 'a' + 1;		
		if (posCharA + dif <= 26) {
			return (char) (charA + dif);
		}	
		return (char) ('a' + (dif + posCharA - 27));		
	}

	private static StringBuilder[] buildField(String[] fields, String key) {
		int aux = 0;
		StringBuilder[] temp = new StringBuilder[fields.length];		
		for (int i = 0; i < fields.length; i++) {
			StringBuilder sb = new StringBuilder();
			if (!LETTERS.contains(fields[i].charAt(0)+"")) {
				for (int k = 0; k < fields[i].length(); k++) {
					sb.append(key.charAt(aux));
					aux++;
					if (aux == key.length()) {
						aux = 0;
					}
				}
			}
			else {
				sb.append(fields[i]);
			}
			temp[i] = sb;
		}
		
		return temp;
	}
}