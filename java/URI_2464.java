package URI;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class URI_2464 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String string = sc.next();
		String cript = sc.next();
		
		Map<Character, Character> map = new HashMap<>();
		for (int i = 0; i < 26; i++) {
			map.put(string.charAt(i), (char) ('a' + i));
		}
		
		String newStr = "";
		for (int i = 0; i < cript.length(); i++	) {
			newStr += map.get(cript.charAt(i));
		}
		
		System.out.println(newStr);		
		
		sc.close();
	}
}