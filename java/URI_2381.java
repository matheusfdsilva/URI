package URI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class URI_2381 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
						
		int n = sc.nextInt();
		int sorteado = sc.nextInt();
		List<String>names = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			names.add(sc.next());
		}
		
		Collections.sort(names);
		System.out.println(names.get(sorteado-1));
		
		sc.close();
	}
}
