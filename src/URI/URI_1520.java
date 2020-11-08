package URI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class URI_1520 {

	private static List<Integer> list = new ArrayList<>();
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			
		while (sc.hasNext()) {
			int n = sc.nextInt();
			
			for (int i = 0; i < n; i++) {
				int start = sc.nextInt();
				int finish = sc.nextInt();
				addList(start, finish);
			}
			
			Collections.sort(list);
			
			int size = sc.nextInt();			
			int firstIndex = list.indexOf(size);
			if (firstIndex != -1) {
				int lastIndex = list.lastIndexOf(size);
				System.out.println(size + " found from " + firstIndex + " to " + lastIndex);
			}
			else {
				System.out.println(size + " not found");
			}
			list.clear();
		}		
		
		sc.close();
	}

	private static void addList(int start, int finish) {
		for (int i = start; i <= finish; i++) {
			list.add(i);
		}		
	}
}