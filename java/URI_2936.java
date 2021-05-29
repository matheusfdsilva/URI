package URI;

import java.util.Scanner;

public class URI_2936 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int c = sc.nextInt();
		int b = sc.nextInt();
		int bo = sc.nextInt();
		int m = sc.nextInt();
		int l = sc.nextInt();
		
		int qtde = c * 300 + b * 1500 + bo * 600 + m * 1000 + l * 150 + 225;
		System.out.println(qtde);		
		
		sc.close();
	}
}
