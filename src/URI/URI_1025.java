package URI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class URI_1025 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int caso = 1;
		
		while (x != 0 && y != 0) {
			List<Integer>list = new ArrayList<>();
			for (int i = 0; i < x; i++) {
				list.add(sc.nextInt());
			}
			
			Collections.sort(list);
						
			System.out.println("CASE# " + caso + ":");
			
			for (int i = 0; i < y; i++) {
				int num = sc.nextInt();
				int index = list.indexOf(num);
				
				if (index == - 1) {
					System.out.println(num + " not found");
				}
				else {
					System.out.println(num + " found at " + (index + 1));
				}				
			}			
			caso++;
			
			x = sc.nextInt();
			y = sc.nextInt();
		}
		
		sc.close();
	}
}
