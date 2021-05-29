package URI;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class URI_1318 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		while (n != 0 && m != 0) {
			Map<Integer, Integer> tickets = new HashMap<>();			
			
			for (int i = 0; i < m; i++) {
				int ticket = sc.nextInt();
				if (tickets.containsKey(ticket)) {
					tickets.put(ticket, 1);
				}
				else {
					tickets.put(ticket, 0);
				}
			}
			int ticketsAlreadyExists = 0;
			
			for (Integer key : tickets.keySet()) {
				ticketsAlreadyExists += tickets.get(key);
			}
			System.out.println(ticketsAlreadyExists);
			n = sc.nextInt();
			m = sc.nextInt();
		}
		
		
		sc.close();

	}

}
