package URI;
import java.util.Locale;
import java.util.Scanner;

public class URI_1048 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario = sc.nextDouble();
		double novoSalario;		
		
		if(salario <= 400.0) {						
			novoSalario = salario * 1.15;			
		}
		else if(salario <= 800.0) {			
			novoSalario = salario * 1.12;
		}
		else if(salario <= 1200.0) {			
			novoSalario = salario * 1.10;
		}
		else if(salario <= 2000.0) {			
			novoSalario = salario * 1.07;
		}
		else {
			novoSalario = salario * 1.04;
		}
		
		double reajuste = novoSalario - salario;
		double percentual = (novoSalario / salario - 1) * 100;
		System.out.printf("Novo salario: %.2f%n", novoSalario);
		System.out.printf("Reajuste ganho: %.2f%n", reajuste);
		System.out.printf("Em percentual: %.0f %%%n", percentual);
		sc.close();

	}

}
