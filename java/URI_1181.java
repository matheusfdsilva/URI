package URI;
import java.util.Locale;
import java.util.Scanner;

public class URI_1181 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double[][] matriz = new double[12][12];
		
		int linha = sc.nextInt();
		char operacao = sc.next().charAt(0);
		double soma = 0, media = 0;
		
		for(int l = 0; l < matriz.length; l++) {
			for(int c = 0; c < matriz[l].length; c++) {
				matriz[l][c] = sc.nextDouble();
			}
		}				
		
		for(int i = 0; i < matriz.length; i++) {		
			soma += matriz[linha][i];			
		}
		
		if(operacao == 'S') {
			System.out.printf("%.1f\n", soma);
		} else if (operacao == 'M') {
			media = soma / 12;
			System.out.printf("%.1f\n", media);
		}					
		
		sc.close();

	}

}
