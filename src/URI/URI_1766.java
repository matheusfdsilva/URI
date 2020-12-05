package URI;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class URI_1766 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for (int i = 1; i <= t; i++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			Rena[] list = new Rena[n];
			for (int k = 0; k < n; k++) {
				String nome = sc.next();
				Integer peso = sc.nextInt();
				Integer idade = sc.nextInt();
				Double altura = sc.nextDouble();
				list[k] = new Rena(nome, peso, idade, altura);
			}
			
			Arrays.sort(list, (x, y) -> {
				if (x.peso.compareTo(y.peso) == 0) {
					if (x.idade.compareTo(y.idade) == 0) {
						if (x.altura.compareTo(y.altura) == 0) {
							return x.nome.compareTo(y.nome);
						}
						return x.altura.compareTo(y.altura);
					}
					return x.idade.compareTo(y.idade);
				}				
				return -x.peso.compareTo(y.peso);	
			});			
						
			System.out.println("CENARIO {" + i + "}");
			for (int l = 1; l <= m; l++) {
				System.out.println(l + " - " + list[l-1].nome);
			}				
		}
		
		sc.close();
	}
	
	public static class Rena {
		public String nome;
		public Integer peso;
		public Integer idade;
		public Double altura;
		
		public Rena(String nome, Integer peso, Integer idade, Double altura) {			
			this.nome = nome;
			this.peso = peso;
			this.idade = idade;
			this.altura = altura;
		}	
	}
}