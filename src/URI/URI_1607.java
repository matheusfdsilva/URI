package URI;

import java.util.Scanner;

public class URI_1607 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			String start = sc.next();
			String end = sc.next();
						
			int moves = advancingLetters(start, end);			
			System.out.println(moves);
		}		
		
		sc.close();
	}
	
	static int advancingLetters(String a, String b) {
		int moves = 0;
		
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) > b.charAt(i)) {				
				moves += 26 - a.charAt(i) + b.charAt(i);				
			}
			else {
				moves += b.charAt(i) - a.charAt(i);			
			}
		}
		
		return moves;
	}
}