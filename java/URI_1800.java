package URI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class URI_1800 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int q = sc.nextInt();
		sc.nextInt();
		sc.nextLine();
		List<String> last2Days = new ArrayList<>();
		last2Days.addAll(Arrays.asList(sc.nextLine().split(" ")));
		
		for (int i = 0; i < q; i++) {
			String n = sc.next();
			int indexOf = last2Days.indexOf(n);
			if (indexOf == -1) {
				last2Days.add(n);
			}
			System.out.println(indexOf == -1 ? 1 : 0);
		}
		
		sc.close();
	}
}