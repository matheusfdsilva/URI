package URI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class URI_1436 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			List<Integer> list = new ArrayList<>();
			
			int players = sc.nextInt();
			for (int x = 0; x < players; x++) {
				list.add(sc.nextInt());
			}
			
			Collections.sort(list);
			System.out.println(list.size());
			
			System.out.println("Case " + i + ": " + list.get(list.size()/2));
		}
		
		
		sc.close();

	}

}
