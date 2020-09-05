package URI;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class URI_2779 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		Set<Integer>left = new HashSet<>();
		for (int i = 0; i < m; i++) {
			left.add(sc.nextInt());
		}
		System.out.println(n - left.size());		
		
		sc.close();
	}
}
