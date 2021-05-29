package URI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class URI_2479 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		List<String> list = new ArrayList<>();
		int y = 0, x = 0;
		
		for (int i = 0; i < n; i++) {
			char ch = sc.next().charAt(0);
			if (ch == '+') {
				y++;
			}
			else {
				x++;
			}
			String nome = sc.next();
			list.add(nome);
		}
		
		Collections.sort(list);
		list.forEach(System.out::println);
		System.out.println("Se comportaram: " + y + " | Nao se comportaram: " + x);		
		
		sc.close();
	}
}