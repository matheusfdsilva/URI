package URI;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class URI_1367 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Map<Character, Integer> map = new HashMap<>();
		
		while (n != 0) {
			int correct = 0;
			int timeAcceptAnswer = 0;
			for (int i = 0; i < n; i++) {				
				char letter = sc.next().charAt(0);
				int time = sc.nextInt();
				String answer = sc.next();
				if (answer.equals("incorrect")) {
					if (map.containsKey(letter)) {
						map.put(letter, map.get(letter) + 20);
					}
					else {
						map.put(letter, 20);
					}
				}
				else {
					if (map.containsKey(letter)) {
						timeAcceptAnswer += map.get(letter) + time;
					}
					else {
						timeAcceptAnswer += time;
					}
					correct++;
				}
			}
			
			System.out.println(correct + " " + timeAcceptAnswer);
			map.clear();
			n = sc.nextInt();
		}		
		
		sc.close();
	}
}