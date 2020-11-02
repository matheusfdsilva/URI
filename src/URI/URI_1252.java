package URI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class URI_1252 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		System.out.println(n + " " + m);
		
		while (n != 0 && m != 0) {
			Map<Integer, String> map = new TreeMap<>();
			for (int i = 0; i < n; i++) {
				Integer num = sc.nextInt();
				Integer mod = num % m;
				if (map.containsKey(mod)) {
					map.put(mod, map.get(mod)+" "+num);					
				}
				else {
					map.put(mod, ""+num);
				}				
			}
				
			List<Integer> impares = new ArrayList<>();
			List<Integer> pares = new ArrayList<>();
			
			for (Integer key : map.keySet()) {				
				String[] array = map.get(key).split(" ");
				int[] arrayInt = new int[array.length];
				for (int l = 0; l < array.length; l++) {
					arrayInt[l] = Integer.parseInt(array[l]);
				}
				Arrays.sort(arrayInt);	
								
				for (int k = array.length-1; k >=0; k--) {					
					if (arrayInt[k] % 2 == 0) {
						pares.add(arrayInt[k]);
					}
					else {
						impares.add(arrayInt[k]);
					}
				}
				
				impares.forEach(System.out::println);
				for (int i = pares.size()-1; i >= 0; i--) {
					System.out.println(pares.get(i));
				}
				
				impares.clear();
				pares.clear();
			}		
			
			n = sc.nextInt();
			m = sc.nextInt();
			System.out.println(n + " " + m);			
		}
		
		sc.close();
	}
}