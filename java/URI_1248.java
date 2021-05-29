package URI;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class URI_1248 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		Set<Character> diet = new TreeSet<>();
		Set<Character> set = new HashSet<>();
		
		for (int i = 0; i < n; i++) {
			String temp = sc.nextLine();
			for (char ch : temp.toCharArray()) {
				diet.add(ch);
			}			
			String breakfast = sc.nextLine();
			String lunch = sc.nextLine();
			
			String dinner = isCheater(diet, set, breakfast);
			if (dinner != null)  dinner = isCheater(diet, set, lunch);
			
			System.out.println(dinner == null ? "CHEATER" : dinner);
			diet.clear();
			set.clear();
		}
		
		sc.close();

	}
	static String isCheater(Set<Character> diet, Set<Character> set, String str) {			
		String dinner = "";
		for (int i = 0; i < str.length(); i++) {
			if (set.contains(str.charAt(i)) || !diet.contains(str.charAt(i))) {
				return dinner = null;
			}
			set.add(str.charAt(i));
		}
		diet.removeAll(set);
		
		for (Character x : diet) {
			dinner += x;
		}		
		return dinner;
	}
}
