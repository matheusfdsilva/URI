package URI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class URI_2729 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < n; i++) {			
			String[] temp = sc.nextLine().split(" ");			
			List<String> list = new ArrayList<>();	
						
			for (String str : temp) {
				if (list.indexOf(str) == -1) {
					list.add(str);
				}
			}
			
			Collections.sort(list);
			int aux = 0;
			
			for (String str : list) {
				if (aux == list.size() - 1) {
					System.out.println(str);
				}
				else System.out.print(str + " ");
				aux++;
			}			
		}
		
		sc.close();
	}
}