package URI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class URI_2534 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
		
		while (sc.hasNext()) {
			
			int n = sc.nextInt();
			int q = sc.nextInt();
			List<Integer> notas = new ArrayList<>();
			
			for (int i = 0; i < n; i++) {
				int num = sc.nextInt();
				notas.add(num);
			}
			Collections.sort(notas);
			Collections.reverse(notas);
			
			for (int i = 0; i < q; i++) {
				int p = sc.nextInt();
				System.out.println(notas.get(p-1));
			}
		}	
		
		sc.close();
	}
}
