package URI;

import java.util.Scanner;

public class URI_2339 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int partic = sc.nextInt();
		int papeis = sc.nextInt();
		int papeisCada = sc.nextInt();
		
		System.out.println(papeis / partic >= papeisCada ? "S" : "N");
		
		sc.close();
	}
}