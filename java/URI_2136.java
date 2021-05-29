package URI;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class URI_2136 {
	
	public static final Map<String, String> MAP = new TreeMap<>();
	public static final Set<String> SET = new LinkedHashSet<>();
	public static int LENGHT = 0;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String name = sc.next();
		
		do {
			String option = sc.next();
			if (option.equals("YES")) {
				if (name.length() > LENGHT) {
					LENGHT = name.length();
				}
				SET.add(name);
			}
			MAP.put(name, option);
			
			name = sc.next();	
			
		}while (!name.equals("FIM"));
		
		List<String> list = makeList(MAP);				
				
		for (String str : list) {			
			System.out.println(str);
		}
		
		System.out.println("Amigo do Habay:");	
		String friend = nameFriend(SET, LENGHT);
		System.out.println(friend);
		
		sc.close();

	}
	
	static List<String> makeList(Map<String, String> map){
		List<String> names = new ArrayList<>();
		StringBuilder sb = new StringBuilder();		
		
		for (String key : map.keySet()) {
			if (map.get(key).equals("YES")) {
				names.add(key);
			}
			else {
				sb.append(key + "\n");
			}			
		}
				
		names.add(sb.toString());
		return names;
	}
	
	static String nameFriend(Set<String>set, int lenght){			
		List<String> friend = set.stream().filter(f -> f.length() == lenght).collect(Collectors.toList());
		return friend.get(0);
	}
}