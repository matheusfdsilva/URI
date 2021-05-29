package URI;

import java.util.Scanner;

public class URI_3047 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = M - a - b;
		
		System.out.println(maior(a, b, c));		
		
		sc.close();

	}
	public static int maior(int a, int b, int c) {
		int maior = a;
		
		if(b > maior) maior = b;
		if(c > maior) maior = c;
		
		return maior;
	}
}
