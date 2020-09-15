package URI;

import java.util.Scanner;

public class URI_2635 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int caso = 0;
		
		while (sc.hasNext()) {
			if (caso > 0) System.out.println();
			
			int n = sc.nextInt();
			String[] fields = new String[n];
			for (int i = 0; i < n; i++) {
				fields[i] = sc.next();
			}
			int z = sc.nextInt();
			for (int i = 0; i < z; i++) {
				String pesquisa = sc.next();
				int count = 0, maxLenght = 0;
				for (int j = 0; j < fields.length; j++) {
					if (fields[j].startsWith(pesquisa)) {
						if (fields[j].length() > maxLenght) {
							maxLenght = fields[j].length();
						}
						count++;
					}					
				}
				
				if (count == 0) System.out.println("-1");
				else System.out.println(count + " " + maxLenght);			
			}	
			caso++;
		}		
		
		sc.close();
	}	
}
