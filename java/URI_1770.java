package URI;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class URI_1770 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			int m = sc.nextInt();
			int k = sc.nextInt();
			int[] vect = new int[m];
			for (int i = 0; i < m; i++) {
				int duration = sc.nextInt();
				vect[i] = duration;
			}
			Set<Integer> set = new HashSet<>();
			int time = 0;
			for (int i = 0; i < k; i++) {
				int id = sc.nextInt();
				if (set.size() < m) {
					set.add(id);
					time += vect[id-1];
				}				
			}			
			System.out.println(set.size() == m ? time : -1);			
		}
		
		sc.close();
	}
}