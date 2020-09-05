package URI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class URI_2916 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			List<Integer> list = new ArrayList<>();
			for (int i = 0; i < n; i++) {
				list.add(sc.nextInt());
			}
			Collections.sort(list);
			Collections.reverse(list);
									
			long sum = 0L;
			for (int i = 0; i < k; i++) {
				sum += list.get(i);
			}
			
			sum = sum % 1000000007;
			
			System.out.println(sum);
		}		
		
		sc.close();
	}
}