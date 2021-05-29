package URI;
import java.util.Locale;
import java.util.Scanner;

public class URI_1160 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			int PA = sc.nextInt();
			int PB = sc.nextInt();
			double G1 = sc.nextDouble();
			double G2 = sc.nextDouble();			
			int anos = 0;	
			
			while(PB >= PA && anos <= 100) {
				PA += (PA * G1) / 100;
				PB += (PB * G2) / 100;				
				anos += 1;					
			}
			if(anos > 100) {
				System.out.println("Mais de 1 seculo.");
			}			
			else {
				System.out.println(anos + " anos.");					
			}		
			
		}		
		
		
		
		sc.close();

	}

}
