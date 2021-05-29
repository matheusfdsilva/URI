package URI;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class URI_2783 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int c = sc.nextInt();
		int m = sc.nextInt();		
		
		Set<Integer> figCarimbada = new HashSet<>();
		for (int i = 0; i < c; i++) {			
			figCarimbada.add(sc.nextInt());
		}		
		
		Set<Integer> figComprada = new HashSet<>();
		for (int i = 0 ; i < m; i++) {
			figComprada.add(sc.nextInt());
		}
		
		Set<Integer> left = new HashSet<>(figCarimbada);
		left.removeAll(figComprada);
		System.out.println(left.size());		
		
		sc.close();
	}
}
