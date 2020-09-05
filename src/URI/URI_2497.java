package URI;

import java.util.Scanner;

public class URI_2497 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int experimento = 1;
		
		while (n != - 1) {
			
			int fullCycle = n / 2;
			System.out.println("Experiment " + experimento + ": " + fullCycle + " full cycle(s)");
			experimento++;
			n = sc.nextInt();
		}		
		
		sc.close();
	}
}
