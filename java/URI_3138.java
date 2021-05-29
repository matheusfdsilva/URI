package URI;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class URI_3138 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		Map<String, Integer> map = new HashMap<>();
		int tot = 0;

		for (int i = 0; i < n; i++) {
			String color = sc.next();
			int quantity = sc.nextInt();
			
			if (map.containsKey(color)) map.put(color, map.get(color) + quantity);
			else map.put(color, quantity);
			
			tot += quantity;
		}
		
		long sequencias = 0L;			
		long x = fatorial(tot);			
		long y = 1L;
		for (String key : map.keySet()) {
			y *= fatorial(map.get(key));
		}			
		sequencias = x / y;		
		
		System.out.println("Feliz aniversario Tobias!");		 		
		System.out.println(sequencias);

		sc.close();
	}

	static Long fatorial(int x) {
		long fat = 1L;
		for (int i = x; i > 1; i--) {
			fat *= i;
		}
		return fat;
	}
}
