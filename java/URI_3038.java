package URI;

import java.util.Scanner;

public class URI_3038 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String line = sc.nextLine();
			
			System.out.println(line.replace("@","a").replace("&", "e").replace("!", "i").replace("*","o").replace("#", "u"));
			
		}
		
		sc.close();
	}
}
