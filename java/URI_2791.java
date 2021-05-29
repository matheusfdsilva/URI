package URI;

import java.util.Scanner;

public class URI_2791 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[]vect = new int[4];
		
		for (int i = 0; i < vect.length; i++) {
			vect[i] = sc.nextInt();			
		}
		
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] == 1) System.out.println(i + 1);		
		}	
		
		sc.close();
	}
}
