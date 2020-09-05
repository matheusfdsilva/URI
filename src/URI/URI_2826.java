package URI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class URI_2826 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		List<String> list = new ArrayList<>();
		list.add(sc.next());
		list.add(sc.next());
		
		Collections.sort(list);
		
		for (String st : list) {
			System.out.println(st);
		}			
		
		sc.close();
	}	
}
