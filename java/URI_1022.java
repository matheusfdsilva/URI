package URI;

import java.util.Scanner;

public class URI_1022 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			int n1 = sc.nextInt();
			String barra = sc.next();
			int d1 = sc.nextInt();
			String operacao = sc.next();
			int n2 = sc.nextInt();
			barra = sc.next();
			int d2 = sc.nextInt();
			int N, D;
			
			if (operacao.equals("+")) {
				N = n1 * d2 + n2 * d1;
				D = d1 * d2;
			}
			else if (operacao.equals("-")) {
				N = n1 * d2 - n2 * d1;
				D = d1 * d2;
			}
			else if (operacao.equals("*")) {
				N = n1 * n2;
				D = d1 * d2;
			}
			else {
				N = n1 * d2;
				D = d1 * n2;
			}
			
			System.out.print(N + "/" + D + " = ");
			System.out.println(N/mdc(N, D) + "/" + D/mdc(N,D));								
		}			
		
		sc.close();
	}
	
	public static int mdc(int dividendo, int divisor){
        if (dividendo % divisor == 0) return divisor;
        else return Math.abs(mdc(divisor,dividendo % divisor));          
    }
}
