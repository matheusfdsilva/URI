package URI;
import java.util.Scanner;

public class URI_1066 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int totPositivo = 0;
		int totNegativo = 0;
		int totImpar = 0;
		int totPar = 0;
		
		for(int i = 0; i < 5; i++) {
			int n = sc.nextInt();
			if(n % 2 != 0) {
				totImpar += 1;				
			}
			else {
				totPar += 1;				
			}
			if(n < 0) {
				totNegativo += 1;
			}
			else if(n > 0) {
				totPositivo += 1;
			}
					
		}					
			
		System.out.println(totPar + " valor(es) par(es)");
		System.out.println(totImpar + " valor(es) impar(es)");
		System.out.println(totPositivo + " valor(es) positivo(s)");
		System.out.println(totNegativo + " valor(es) negativo(s)");
		
		
		sc.close();

	}

}
