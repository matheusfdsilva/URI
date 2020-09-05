package URI;
import java.util.Locale;
import java.util.Scanner;

public class URI_2311 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			
			String nome = sc.next();
			double gd = sc.nextDouble();
			double[]notas = new double[7];
			double maior = 0, menor = 0;
			
			double sum = 0;
			
			for (int t = 0; t < notas.length; t++) {
				notas[t] = sc.nextDouble();				
			}
			
			maior = notas[0];
			menor = notas[0];
			
			for (int z = 0; z < notas.length; z++) {								
				
				if (notas[z] > maior) {
					maior = notas[z];
					
				} 
				if (notas[z] < menor) {
					menor = notas[z];
				}	
				
				sum += notas[z];
			}
			
			sum = (sum - (menor + maior)) * gd;
			System.out.println(nome + " " + String.format("%.2f", sum));			
		}		
		
		sc.close();
	}

}
