package URI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class URI_1495 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int g = sc.nextInt();
			int pontos = 0;			
			for (int i = 0; i < n; i++) {
				int s = sc.nextInt();
				int r = sc.nextInt();
				if (s > r) {
					pontos += 3;
				}
				else {
					list.add(r-s);
				}
			}
			
			if (!list.isEmpty()) {
				Collections.sort(list);					
				while (g > 0 && list.size() > 0) {	
					int num = list.get(0);
					if (g > num) {
						pontos += 3;
						g -= num + 1;							
					}
					else if (g == num) {
						pontos += 1;
						g = 0;
					}
					else {
						g = 0;
					}
					
					list.remove(0);					
				}
			}
			
			if (list.contains(0)) {
				long empates = list.stream().filter(x -> x == 0).count();	
				pontos += empates;
			}			
			
			System.out.println(pontos);
			list.clear();
		}		
		
		sc.close();
	}
}