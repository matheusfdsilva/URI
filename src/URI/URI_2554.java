package URI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class URI_2554 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {			
			sc.nextInt();
			int options = sc.nextInt();
			List<String> list = new ArrayList<>();	
			
			for (int i = 0; i < options; i++) {				
				list.add(sc.next());
				list.add(sc.nextLine());						
			}
			
			System.out.println(isPossible(list));
		}	
		
		sc.close();
	}
	
	static String isPossible(List<String>list) {		
		for (int i = 1; i < list.size(); i+=2) {
			if (!list.get(i).contains("0")) {
				return list.get(i-1);
			}						
		}
		return "Pizza antes de FdI";		
	}
}
