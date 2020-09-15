package URI;

import java.util.Collections;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class URI_2663 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int min = sc.nextInt();		
		Map<Integer, Integer>map = new TreeMap<>(Collections.reverseOrder());		
		
		for (int i = 0; i < n; i++) {
			int points = sc.nextInt();
			if (map.containsKey(points)) {
				map.put(points, map.get(points) +1);
			}
			else {
				map.put(points, 1);
			}			
		}
		
		int count = classificados(map, min);		
		System.out.println(count);
		
		sc.close();
	}
	
	static int classificados(Map<Integer, Integer> map, int min) {
		int count = 0;
		for (Integer key : map.keySet()) {	
			if (count >= min) {
				return count;
			}
			count += map.get(key);			
		}
		return count;
	}
}