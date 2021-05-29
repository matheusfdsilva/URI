package URI;

import java.util.Scanner;

public class URI_3065 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int caso = 1;		
		
		while (n != 0) {
			String line = sc.next();
			String[]fields = line.replace("+"," ").replace("-", " ").split(" ");
			int[] number = new int[fields.length];
			
			for (int i = 0; i < n; i++) {
				number[i] = Integer.parseInt(fields[i]);
			}
			
			int soma = number[0], aux = 1;
			for (int i = 0; i < line.length(); i++) {
				if (line.charAt(i) == '+') {
					soma += number[aux];
					aux++;
				}
				else if (line.charAt(i) == '-') {
					soma -= number[aux];
					aux++;
				}
			}
			
			System.out.println("Teste " + caso);
			System.out.println(soma);
			System.out.println();
			n = sc.nextInt();
			caso++;
		}
		
		sc.close();

	}
}
