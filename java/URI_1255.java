package URI;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class URI_1255 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < n; i++) {			
			String st = sc.nextLine().toLowerCase().replace(" ", "");			
			String letters = countLettersUsed(st);
			
			System.out.println(letters);			
		}		
		
		sc.close();
	}
	
	static String countLettersUsed(String st){
		Map<Character, Integer> map = new TreeMap<>();	
		int max = 1;
		int sum;
		
		for (char ch : st.toCharArray()) {			
			if (map.containsKey(ch)) {
				sum = map.get(ch) + 1;
				map.put(ch, sum);
				if (sum > max) max = sum;
			}
			else {
				map.put(ch, 1);
			}
		}		
		return lettersMostUsed(map, max);
	}
	
	static String lettersMostUsed(Map<Character, Integer> map, int max) {
		String mostUseds = "";
				
		for(Character key : map.keySet()) {
			if (map.get(key) == max) {
				mostUseds += key;
			}
		}		
		return mostUseds;		
	}
}
