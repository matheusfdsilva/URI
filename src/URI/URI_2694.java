package URI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class URI_2694 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<>();
				
		for (int i = 0; i < n; i++) {
			String line = sc.next();
			String number = "";
			for (char ch : line.toCharArray()) {
				if (Character.isDigit(ch)) {
					number += ch;
				}
				else if (!number.isEmpty()) { 
					list.add(Integer.parseInt(number));
					number = "";					
				}
			}
			if (!number.equals("")) {
				list.add(Integer.parseInt(number));
			}
						
			System.out.println(list.stream().reduce(0, (x, y) -> x + y));
			list.clear();
			
		}
		
		sc.close();
	}
}