package URI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class URI_2766 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<String> universidades = new ArrayList<>();
				
		for (int i = 0; i < 10; i++) {
			universidades.add(sc.next());
		}
		
		System.out.println(universidades.get(2));
		System.out.println(universidades.get(6));
		System.out.println(universidades.get(8));
		
		sc.close();
	}
}
