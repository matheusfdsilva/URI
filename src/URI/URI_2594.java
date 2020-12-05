package URI;

import java.util.Scanner;

public class URI_2594 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();		
		
		for (int i = 0; i < n; i++) {
			sc.nextLine();
			String[] text = sc.nextLine().split(" ");
			String word = sc.next();
			String indexs = "";
			int cont = 0;
			for (String str : text) {				
				if (str.equals(word)) {
					indexs += " " + cont;
				}
				cont += str.length() + 1;				
			}
			if (indexs.isEmpty()) {
				indexs = "-1";
			}
			System.out.println(indexs.trim());
		}
		
		sc.close();
	}
}