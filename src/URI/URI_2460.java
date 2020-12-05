package URI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class URI_2460 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		List<String> list = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			String num = sc.next();
			list.add(num);
		}
		
		int m = sc.nextInt();	
		for (int i = 0; i < m; i++) {
			String num = sc.next();
			int indexOf = list.indexOf(num);
			list.remove(indexOf);
		}
		
		String s = String.join(" ", list);
		System.out.println(s);
				
		sc.close();
	}
}