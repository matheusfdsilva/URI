package URI;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class URI_1261 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		Map<String, Integer> map = new HashMap<>();
				
		for (int i = 0; i < m; i++) {
			String word = sc.next();
			int value = sc.nextInt();
			map.put(word, value);		
		}
				
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			int salary = 0;
			StringBuilder sb = new StringBuilder();
			String line = sc.nextLine();
			sb.append(line);
			while (!line.endsWith(".")) {
				line = sc.nextLine();
				sb.append(" " + line);
			}
			
			String[] fields = sb.toString().split(" ");
			for (int k = 0; k < fields.length; k++) {					
				if (map.containsKey(fields[k])) {
					salary += map.get(fields[k]);
				}
			}
			System.out.println(salary);
		}
		
		sc.close();
		
	}	
}