package URI;

import java.util.Scanner;

public class URI_1467 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String[]twoOrOne = sc.nextLine().split(" ");			
			System.out.println(winner(twoOrOne));			
		}		
		
		sc.close();
	}	
	
	static String winner(String[]twoOrOne) {
		if (!twoOrOne[0].equals(twoOrOne[1]) && twoOrOne[1].equals(twoOrOne[2])) {
			return "A";
		}
		if (!twoOrOne[1].equals(twoOrOne[0]) && twoOrOne[0].equals(twoOrOne[2])) {
			return "B";
		}
		if (!twoOrOne[2].equals(twoOrOne[0]) && twoOrOne[1].equals(twoOrOne[0])) {
			return "C";
		}
		return "*";
	}
}
