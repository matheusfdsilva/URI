package URI;

import java.util.Scanner;

public class URI_2815 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] words = sc.nextLine().split(" ");
		String rightString = "";
		
		for (int i = 0; i < words.length; i++) {			
			if (words[i].length() >= 4 && words[i].substring(2, 4).equals(words[i].substring(0, 2))) {
				rightString += words[i].substring(2) + " ";			
			}
			else rightString += words[i] + " ";
		}
		
		System.out.println(rightString.trim());
		
		sc.close();
	}
}