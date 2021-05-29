package URI;

import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class URI_1861 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Map<String, Integer> map = new TreeMap<>();
		Set<String> deathPeoples = new HashSet<>();
				
		while (sc.hasNext()) {
			String assassino = sc.next();
			String assassinado = sc.next();
			deathPeoples.add(assassinado);
			
			if (!deathPeoples.contains(assassino)) {
				if (map.containsKey(assassino)) {
					int mortos = map.get(assassino);
					map.put(assassino, mortos + 1);
				}
				else {
					map.put(assassino, 1);
				}				
			}	
			
			if (map.containsKey(assassinado)) {
				map.remove(assassinado);
			}				
		}
		
		System.out.println("HALL OF MURDERERS");
		for (String keys : map.keySet()) {
			System.out.println(keys + " " + map.get(keys));
		}
		sc.close();

	}
}
