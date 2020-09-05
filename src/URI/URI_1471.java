package URI;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class URI_1471 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {			
			int divers = sc.nextInt();
			int returned = sc.nextInt();
			Set<Integer> set = new HashSet<>();
			
			for (int i = 0; i < returned; i++) {
				set.add(sc.nextInt());
			}
			
			System.out.println(checkList(set, divers));			
		}
		
		sc.close();
	}
	
	static String checkList(Set<Integer>set, int divers) {
		String noBack = "";
		for (int i = 1; i <= divers; i++) {			
			if (!set.contains(i)) {				
				noBack += i + " ";
			}
		}
		if (noBack.isEmpty()) noBack = "*";
		return noBack;
	}
}