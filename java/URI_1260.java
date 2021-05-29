package URI;

import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class URI_1260 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();	
		sc.nextLine();
		sc.nextLine();
		
		Map<String, Integer> map = new TreeMap<>();
		String typeWood;
				
		for (int i = 0; i < n; i++) {			
			double countWoods = 0.0;			
			
			if (i != n -1) {
				typeWood = sc.nextLine();
				while (!typeWood.isEmpty()) {
					countWoods++;
					map = seedingMap(map, typeWood);
					typeWood = sc.nextLine();
				}
			}
			else {
				while (sc.hasNextLine()) {
					typeWood = sc.nextLine();
					countWoods++;
					map = seedingMap(map, typeWood);					
				}
			}
				
			double avg;
			for (String key : map.keySet()) {
				avg = map.get(key) / countWoods * 100;
				System.out.printf("%s %.4f\n", key, avg);
			}
			if (i != n -1) System.out.println();
			map.clear();
		}
				
		sc.close();
	}
	static Map<String, Integer> seedingMap(Map<String, Integer> map, String typeWood){
		if (map.containsKey(typeWood)) {
			map.put(typeWood, map.get(typeWood) + 1);
		}
		else {
			map.put(typeWood, 1);
		}
		return map;
	}
}