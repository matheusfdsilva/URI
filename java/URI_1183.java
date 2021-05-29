package URI;
import java.util.Locale;
import java.util.Scanner;

public class URI_1183 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char O = sc.next().toUpperCase().charAt(0);
		double[][] M = new double[12][12];
		double soma = 0;
		double media = 0;
		double cont = 0;
		
		for(int l = 0; l < M.length; l++) {
			for(int c = 0; c < M[l].length; c++) {				
				M[l][c] = sc.nextDouble();
			}
		}			
		
		for(int l = 0; l < M.length; l++) {
			for(int c = 0; c < M[l].length; c++) {
				if(c > l) {
					soma += M[l][c];
					cont += 1;
				}				
			}
		}
		
		if (O == 'S') {
			System.out.printf("%.1f\n", soma);
		} else if (O == 'M'){
			media = soma / cont;
			System.out.printf("%.1f\n", media);
		}
		sc.close();
	}

}
