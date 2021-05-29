package URI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class URI_1259 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
						
		List<Integer>pares = new ArrayList<>();
		List<Integer> impares = new ArrayList<>();
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			if (num % 2 == 0) pares.add(num);
			else impares.add(num);
		}
		
		Collections.sort(pares);
		Collections.sort(impares);
		Collections.reverse(impares);
		
		for (Integer par : pares) {
			System.out.println(par);
		}		
		for (Integer imp : impares) {
			System.out.println(imp);
		}		
		
		sc.close();
	}
}
