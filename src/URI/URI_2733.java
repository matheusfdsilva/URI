package URI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class URI_2733 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
				
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int cont = 0;
			for (int i = 0; i < n; i++) {
				int id = sc.nextInt();
				if (!list.contains(id)) {
					if (list.size() == 4) {
						list.remove(0);						
					}
					list.add(id);
					cont++;
				}
			}
			System.out.println(cont);
			list.clear();
		}
		
		sc.close();
	}
}