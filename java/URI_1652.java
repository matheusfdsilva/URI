package URI;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class URI_1652 {

	private static String vogals = "aeiou";
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int l = sc.nextInt();
		int n = sc.nextInt();
		
		Map<String, String> map = new HashMap<>();
		
		for (int i = 0; i < l; i++) {
			String singular = sc.next();
			String plural = sc.next();
			map.put(singular, plural);
		}
		
		for (int i = 0; i < n; i++) {
			String s = sc.next();
			if (map.containsKey(s)) {
				System.out.println(map.get(s));
			}
			else if (s.endsWith("o") || s.endsWith("s") || s.endsWith("ch") || s.endsWith("sh") || s.endsWith("x")) {
				System.out.println(s+"es");
			}
			else if (s.endsWith("y") && !vogals.contains(s.charAt(s.length()-2)+"")) {
				int lastIndex = s.lastIndexOf("y");
				System.out.println(s.substring(0, lastIndex)+"ies");
			}
			else {
				System.out.println(s+"s");
			}
		}		
		
		sc.close();
	}
}