package URI;

import java.util.Locale;
import java.util.Scanner;

public class URI_1808 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int qtdNotas = 1;		
		String[] s = sc.next().split("");
		int soma = Integer.parseInt(s[0]);
		
		for (int i = 1; i < s.length; i++) {
			if (s[i].equals("0")) {
				soma += 9;
			}
			else {
				soma += Integer.parseInt(s[i]);
				qtdNotas++;
			}
		}		
		double avg = soma / (qtdNotas * 1.0);
		System.out.printf("%.2f\n", avg);		
		
		sc.close();
	}
}
