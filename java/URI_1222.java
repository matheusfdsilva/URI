package URI;

import java.util.Scanner;

public class URI_1222 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			int words = sc.nextInt();
			int rows = sc.nextInt();
			int maxCh = sc.nextInt();
			String[] vect = new String[words];
			
			for (int i = 0; i < vect.length; i++) {
				vect[i] = sc.next();
			}
			
			int pages = makeBook(vect, rows, maxCh);
			System.out.println(pages);
		}
		
		sc.close();
	}

	private static int makeBook(String[] vect, int limitRow, int limitCh) {
		int rows = 0, pages = 0;
		String temp = "";
		
		for (int i = 0; i < vect.length; i++) {
			temp += vect[i];
			if (temp.length() + 1 <= limitCh) {
				temp += " ";
			}
			if (temp.length() > limitCh) {
				temp = "";
				rows++;
				i -= 1; // necessario para começar a proxima linha com a palavra que fez ultrapassar o limite de caracteres
			}
			else if (temp.length() == limitCh) {
				rows++;
				temp = "";
			}
			if (rows == limitRow) {
				rows = 0;
				pages++;
			}			
		}	
		if (!temp.isEmpty() || rows > 0) pages++;
		return pages;
	}
}