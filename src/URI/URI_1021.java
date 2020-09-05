package URI;
import java.util.Locale;
import java.util.Scanner;

public class URI_1021 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int qtde;
		double[] cedulas = new double[] {100.0, 50.0, 20.0, 10.0, 5.0, 2.0};
		double[] moedas = new double[] {1.0, 0.50, 0.25, 0.10, 0.05, 0.01};
		
		double N = sc.nextDouble();	
		N = N * 100;
		
		System.out.println("NOTAS:");
		for(double reais : cedulas) {
			qtde = (int) (N / (reais * 100));
			N = (int) (N % (reais * 100));			
			System.out.printf("%d nota(s) de R$ %.2f%n", qtde, reais);			
		}		
		
		System.out.println("MOEDAS:");				
		for(double coins : moedas) {
			qtde = (int) (N / (coins * 100));
			N = (int) (N % (coins * 100));			
			System.out.printf("%d moeda(s) de R$ %.2f%n", qtde, coins);
		}		
		
		sc.close();				

	}

}
