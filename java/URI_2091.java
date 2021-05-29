package URI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class URI_2091 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		while (n != 0) {
			List<Long>list = new ArrayList<>();
			for (int i = 0; i < n; i++) {
				Long number = sc.nextLong();
				if (list.contains(number)) {
					int index = list.indexOf(number);
					list.remove(index);
				}
				else list.add(number);				
			}
			System.out.println(list.get(0));
			
			n = sc.nextInt();
		}
		
		sc.close();
	}
}