package URI;

import java.util.Scanner;

public class URI_2850 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String p = sc.nextLine();
			if (p.equals("esquerda")) System.out.println("ingles");
			else if (p.equals("direita")) System.out.println("frances");
			else if (p.equals("nenhuma")) System.out.println("portugues");
			else System.out.println("caiu");
		}		
		
		sc.close();
	}
}
