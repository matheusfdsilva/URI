package URI;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class URI_1256 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Map<Integer, String> map = new HashMap<>();
		
		for (int i = 0; i < n; i++) {
			if (i > 0) System.out.println();
			
			int m = sc.nextInt();
			int c = sc.nextInt();
			map = seedingMap(map, m);
			for (int k = 0 ; k < c; k++) {
				int num = sc.nextInt();
				int result = num % m;
				String add = map.get(result) + String.valueOf(num) + " -> ";
				map.put(result, add);
			}
			
			for (Integer key : map.keySet()) {
				System.out.println(key + map.get(key) + "\\");
			}
			map.clear();
		}
		
		sc.close();

	}
	static Map<Integer, String> seedingMap(Map<Integer, String> map, int n){		
		for (int i = 0; i < n ; i++) {
			map.put(i, " -> ");
		}
		return map;
	}
}
