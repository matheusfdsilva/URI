package URI;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class URI_1449 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int k = sc.nextInt();
		
		for (int i = 0; i < k; i++) {			
			int m = sc.nextInt();
			int n = sc.nextInt();
			Map<String, String> map = new HashMap<>();
			for (int j = 0; j < m; j++) {
				String inJap = sc.next();
				sc.nextLine();
				String inBr = sc.nextLine();
				map.put(inJap, inBr);
			}
			
			for (int j = 0; j < n; j++) {
				String str = sc.nextLine();
				String newString = "";
				for (String st : str.split(" ")) {
					if (map.containsKey(st)) {
						newString += " " + map.get(st);
					}
					else {
						newString += " " + st;
					}
				}
				System.out.println(newString.trim());				
			}
			System.out.println();
		}
		
		sc.close();
	}
}
