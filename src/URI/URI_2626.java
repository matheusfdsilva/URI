package URI;

import java.util.Scanner;

public class URI_2626 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			String dodo = sc.next();
			String leo = sc.next();
			String pepper = sc.next();

			if (dodo.equals("papel") && leo.equals("pedra") && pepper.equals("pedra")
					|| dodo.equals("pedra") && leo.equals("tesoura") && pepper.equals("tesoura")
					|| dodo.equals("tesoura") && leo.equals("papel") && pepper.equals("papel")) {
				System.out.println("Os atributos dos monstros vao ser inteligencia, sabedoria...");
			}
			else if (leo.equals("papel") && dodo.equals("pedra") && pepper.equals("pedra")
					|| leo.equals("pedra") && dodo.equals("tesoura") && pepper.equals("tesoura")
					|| leo.equals("tesoura") && dodo.equals("papel") && pepper.equals("papel")) {
				System.out.println("Iron Maiden's gonna get you, no matter how far!");
			} 
			else if (pepper.equals("papel") && dodo.equals("pedra") && leo.equals("pedra")
					|| pepper.equals("pedra") && dodo.equals("tesoura") && leo.equals("tesoura")
					|| pepper.equals("tesoura") && dodo.equals("papel") && leo.equals("papel")) {
				System.out.println("Urano perdeu algo muito precioso...");
			} 
			else {
				System.out.println("Putz vei, o Leo ta demorando muito pra jogar...");
			}
		}

		sc.close();

	}
}