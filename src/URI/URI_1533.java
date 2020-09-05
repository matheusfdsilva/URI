package URI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class URI_1533 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		while (n != 0) {
			List<Integer> list = new ArrayList<>();
			List<Integer> temp = new ArrayList<>();
			
			for (int i = 0; i < n; i++) {
				temp.add(sc.nextInt());
				list.add(temp.get(i));
			}
			Collections.sort(list);			
			
			int index = temp.indexOf(list.get(list.size()-2)) + 1;
			System.out.println(index);
			
			n = sc.nextInt();
		}
		
		sc.close();
	}
}