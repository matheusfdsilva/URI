package URI;

import java.util.Scanner;

public class URI_2593 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String[] text = sc.nextLine().split(" ");		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			String word = sc.next();
			String indexs = "";
			int count = 0;
			for (String str : text) {						
				if (word.equals(str)) {
					indexs += " " + count;					
				}
				count += str.length() + 1;
			}
			if (indexs.isEmpty()) {
				indexs = "-1";
			}
			System.out.println(indexs.trim());
		}						
				
		sc.close();		
	}
}