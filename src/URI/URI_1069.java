package URI;

import java.util.Scanner;

public class URI_1069 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			String mina = sc.next();			
			String[] joias = mina.replace(".","").split("");
			int diamantes = 0;
			
			for (int x = 0; x < joias.length; x++) {
				if (joias[x] != null && joias[x].equals("<")) {				
					for (int l = x + 1; l < joias.length; l++) {
						if (joias[l] != null && joias[l].equals(">")) {						
							diamantes++;
							joias[l] = null;
							joias[x] = null;
							break;
						}						
					}					
				}
			}
			System.out.println(diamantes);			
		}
		sc.close();
	}
}
