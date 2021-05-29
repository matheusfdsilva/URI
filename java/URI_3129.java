package URI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class URI_3129 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		int repitidas = 0;
		
		for (int i = 0; i < n;i ++) {
			int num = sc.nextInt();
			if (list.contains(num)) {
				repitidas++;
			}
			else {
				list.add(num);
			}
		}
		
		System.out.println(list.size());
		System.out.println(repitidas);		
		
		sc.close();
	}
}