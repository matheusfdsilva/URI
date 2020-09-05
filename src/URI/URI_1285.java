package URI;

import java.util.Scanner;

public class URI_1285 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			
			int x = maxHouses(n, m);
			System.out.println(x);
						
		}
		sc.close();
	}
	
	static int maxHouses(int a, int b) {
		int houses = 0;
		for (int i = a; i <= b; i++) {
			String aux = String.valueOf(i);	
			String aux2 = "";			
			boolean helper = false;
			
			for (char obj : aux.toCharArray()) {
				if (aux2.contains(obj+"")) {	
					helper = false;
					break;
				}
				else {
					aux2 += obj;
					helper = true;
				}
			}			
			
			if(helper) houses++;
		}
		return houses;
	}
}
