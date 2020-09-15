package URI;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class URI_2482 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Map<String, String> map = new HashMap<>();
		
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			String idiom = sc.next();
			sc.nextLine();
			String str = sc.nextLine();
			map.put(idiom, str);
		}
		
		int k = sc.nextInt();			
		for (int i = 0; i < k; i++) {	
			sc.nextLine();
			String name = sc.nextLine();
			String idiom = sc.next();			
			
			System.out.println(name);
			System.out.println(map.get(idiom));
			System.out.println();			
		}
		
		sc.close();
	}
}