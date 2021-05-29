package URI;

import java.util.Scanner;

public class URI_1873 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			String rajesh = sc.next();
			String sheldon = sc.next();
			
			if (rajesh.equals(sheldon)) System.out.println("empate");
			else if (rajesh.equals("tesoura") && (sheldon.equals("papel") || sheldon.equals("lagarto"))
					|| rajesh.equals("papel") && (sheldon.equals("pedra") || sheldon.equals("spock"))
					|| rajesh.equals("pedra") && (sheldon.equals("lagarto") || sheldon.equals("tesoura"))
					|| rajesh.equals("lagarto") && (sheldon.equals("spock") || sheldon.equals("papel"))
					|| rajesh.equals("spock") && (sheldon.equals("pedra") || sheldon.equals("tesoura"))) {
				System.out.println("rajesh");
			}
			else System.out.println("sheldon");
		}
		
		sc.close();
	}
}