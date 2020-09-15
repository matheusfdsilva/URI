package URI;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class URI_2023 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Map<String, String> map = new TreeMap<>();
				
		while (sc.hasNext()) {
			String name = sc.nextLine();
			map.put(name.toLowerCase(), name);			
		}
		
		int i = 0;		
		for (String key : map.keySet()) {
			if (i == map.size()-1) {
				System.out.println(map.get(key));
			}
			i++;
		}
		
		
		sc.close();
	}
}
