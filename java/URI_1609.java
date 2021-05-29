package URI;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class URI_1609 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			Set<Integer>set = new HashSet<>();
			int num = sc.nextInt();
			
			for (int x = 0; x < num; x++) {
				set.add(sc.nextInt());
			}
			
			System.out.println(set.size());
		}
				
		sc.close();
	}
}