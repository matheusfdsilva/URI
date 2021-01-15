package URI;

import java.util.Scanner;

public class URI_2456 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] vect = new int[5];
		
		for (int i = 0; i < vect.length; i++) {
			vect[i] = sc.nextInt();
		}
		
		System.out.println(sorted(vect));		
		
		sc.close();
	}
	
	static String sorted(int[] vect) {
		String order = "N";
		String aux = null;
		for (int i = 1; i < vect.length; i++) {
			if (vect[i] > vect[i-1]) {
				aux = "C";
			}
			else {
				aux = "D";
			}
			if (i >= 2 && !aux.equals(order)) {
				return "N";
			}
			order = aux;
		}
		return order;
	}	
}