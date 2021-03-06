package URI;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class URI_3176 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();		
		List<Duende> list = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			String name = sc.next();
			int age = sc.nextInt();
			list.add(new Duende(name, age));
		}
		
		list.sort((x,y) -> {
			if (x.age - y.age == 0) {
				return x.name.compareTo(y.name);
			}
			return -Integer.compare(x.age, y.age);
		});
		
		int teams = n / 3;
		
		Map<Integer, List<Duende>> map = new LinkedHashMap<>();
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < teams; j++) {	
				List<Duende> duende;
				if (map.containsKey(j+1)) {
					duende = map.get(j+1);					
				}
				else {
					duende = new ArrayList<>();					
				}
				duende.add(list.get(0));
				map.put(j+1, duende);
				list.remove(0);
			}
		}
		
		for (Integer key : map.keySet()) {
			System.out.println("Time " + key);
			map.get(key).forEach(System.out::println);
			System.out.println();
		}				
		
		sc.close();
	}

	public static class Duende {
		public String name;
		public int age;
		
		public Duende(String name, int age) {
			this.name = name;
			this.age = age;
		}
		
		@Override
		public String toString() {
			return name + " " + age;
		}
		
	}	
}