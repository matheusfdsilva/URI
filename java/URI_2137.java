package URI;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class URI_2137 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			Set<String>set = new TreeSet<>();
			int n = sc.nextInt();
			for (int i = 0; i < n; i++) {
				set.add(sc.next());
			}
			for (String str : set) {
				System.out.println(str);
			}
		}
		
		sc.close();
	}
}