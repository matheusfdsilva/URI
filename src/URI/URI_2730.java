package URI;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class URI_2730 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		while (n != 0) {
			int[] par1 = createPar(n, sc);
			int[] par2 = createPar(n, sc);
			Set<String> pares = new HashSet<>();
			
			for (int i = 0; i < par1.length; i++) {
				for (int k = 0; k < par2.length; k++) {			
					int mdcA = mdc(par1[i], par2[k]);
					int mdcB = mdc(par2[k], par1[i]);
					if (mdcA == 1) {
						pares.add(par1[i] + "," + par2[k]);
					}
					if (mdcB == 1) {
						pares.add(par2[k] + "," + par1[i]);
					}										
				}
			}
						
			System.out.println(pares.size());
			n = sc.nextInt();
		}		
		
		sc.close();
	}

	private static int[] createPar(int n, Scanner sc) {
		int[] vect = new int[n];
		for (int i = 0; i < n; i++) {
			vect[i] = sc.nextInt();
		}
		return vect;
	}
	
	private static int mdc(int num1, int num2) {
		if (num1 % num2 == 0) {
			return num2;
		}
		return mdc(num2, num1 % num2);
	}
}
