package URI;

import java.util.Scanner;

public class URI_1944 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
			
		StringBuilder sb = new StringBuilder();
		int winners = 0;		
		
		int n = sc.nextInt();
		String[]fields = new String[n+1];		
		sc.nextLine();	
		
		for (int i = 0, aux = 0; i < n; i++, aux++) {
			String str = sc.nextLine();
			sb.append(str).reverse();
			
			if (fields[0] == null) {
				fields[0] = "F A C E";
			}
			
			if (fields[aux] == null) {
				aux--;
			}
						
			if (sb.toString().equals(fields[aux])) {				
				winners++;
				fields[aux] = null;
				aux--;
			}
			else {
				fields[aux+1] = str;
			}			
			
			sb.delete(0, sb.length());
			
		}
		
		System.out.println(winners);
		
		sc.close();
	}
}