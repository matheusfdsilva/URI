package URI;

import java.util.Scanner;

public class URI_2544 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			int clones = sc.nextInt();
			
			int countTecnica = 0;
			int ninjas = 1;
			while (ninjas < clones) {
				ninjas *= 2;
				countTecnica++;
			}
			System.out.println(countTecnica);
		}
		
		sc.close();
	}
}