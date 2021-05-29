package URI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class URI_1403 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		Map<Integer, Integer>map = new TreeMap<>();
		List<Integer> list = new ArrayList<>();	
				
		while (n != 0 && m != 0) {
			int turns, second = 0;
			String temp = "";
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					int num = sc.nextInt();
					if (map.containsKey(num)) {
						turns = map.get(num);
						map.put(num, turns +1);							
					}
					else {
						map.put(num, 1);
					}					
				}
			}						
			
			for (Integer key : map.keySet()) {
				list.add(map.get(key));
			}
			
			Collections.sort(list);	
			
			second = list.get(list.size()-2);				
			
			for (Integer key : map.keySet()) {
				if (map.get(key) == second) {
					temp += key + " ";
				}
			}
			
			System.out.println(temp);			
			
			map.clear();
			list.clear();
			n = sc.nextInt();
			m = sc.nextInt();
		}
		
		sc.close();
	}
}