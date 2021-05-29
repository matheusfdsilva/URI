package URI;

import java.util.Scanner;

public class URI_1068 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String operacao = sc.next();
			String[] equacao = operacao.split("");
			int parenteses = 0;
		
			for (int i = 0; i < equacao.length; i++) {
				if (equacao[i] != null && equacao[i].equals("(")) {	
					parenteses++;
					for (int x = i + 1; x < equacao.length; x++) {
						if (equacao[x] != null && equacao[x].equals(")")) {							
							parenteses++;							
							equacao[i] = null;
							equacao[x] = null;
							break;
						} 
					}
				}
				else {
					if (equacao[i] != null && equacao[i].equals(")")) {
						parenteses--;
						break;
					}
				}
			}			
			if (parenteses % 2 != 0) System.out.println("incorrect");
			else System.out.println("correct");
			
		}		
		
		sc.close();
	}
}
