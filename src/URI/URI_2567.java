package URI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class URI_2567 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Integer>list = new ArrayList<>();

		while (sc.hasNext()) {
			int n = sc.nextInt();
			for (int i = 0; i < n; i++) {
				int x = sc.nextInt();
				list.add(x);
			}
			
			Collections.sort(list);
			int size = (list.size() % 2 == 0 ? 0 : 1);
			int sum = 0;
			
			while (list.size() != size) {
				sum += list.get(list.size()-1) - list.get(0);
				list.remove(0);
				list.remove(list.size()-1);
			}
			
			System.out.println(sum);
			list.clear();

		}
		
		sc.close();
	}
}