package URI;

import java.util.Scanner;

public class URI_1263 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String[]string = sc.nextLine().toLowerCase().split(" ");			
			
			int countAliteracao = aliteracoes(string);			
			System.out.println(countAliteracao);			
		}		
		
		sc.close();
	}
	
	static int aliteracoes(String[] string) {		
		int count = 0;	
		int countAliteracao = 0;
		
		for (int i = 1; i < string.length; i++) {
			if (string[i].startsWith(string[i-1].charAt(0)+"")) {
				count++;
			}
			else if (count > 0) {
				countAliteracao++;
				count = 0;				
			}			
		}
		if (count > 0) countAliteracao++;
		
		return countAliteracao;
	}
}
