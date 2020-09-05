package URI;

import java.util.Scanner;

public class URI_2813 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int totHouse = 0, totOffice = 0;
		int stayHouse = 0, stayOffice = 0;
		
		for (int i = 0; i < n; i++) {
			String go = sc.next();
			String back = sc.next();
			
			if (go.equals("sol") && back.equals("chuva")) {
				if (stayOffice == 0) totOffice++;
				else stayOffice -= 1;
				stayHouse += 1;										
			}					
			else if (go.equals("chuva") && back.equals("sol")) {
				if (stayHouse >= 1)	stayHouse -= 1;					
				else totHouse++;					
				stayOffice += 1;
			}				
			else if (go.equals("chuva") && back.equals("chuva") && stayHouse == 0) {			
				stayHouse += 1;
				totHouse++;				
			}			
		}
		
		System.out.println(totHouse + " " + totOffice);		
		
		sc.close();
	}
}