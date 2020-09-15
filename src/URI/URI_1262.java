package URI;

import java.util.Scanner;

public class URI_1262 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String str = sc.next();
			int r = sc.nextInt();
			int countR = 0, process = 0;
			
			for (char ch : str.toCharArray()) {
				if (ch == 'W') {
					process++;
					if (countR > 0) {
						process++;
					}
					countR = 0;
				}
				else {
					countR++;
				}
				if (countR == r) {
					process++;
					countR = 0;
				}
			}
			if (countR > 0) process++;
			System.out.println(process);
		}
		
		sc.close();
	}
}