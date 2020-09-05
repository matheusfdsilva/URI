package URI;

import java.util.Scanner;

public class URI_2702 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cA, bA, pA, cR, bR, pR;
		
		cA = sc.nextInt();
		bA = sc.nextInt();
		pA = sc.nextInt();
		cR = sc.nextInt();
		bR = sc.nextInt();
		pR = sc.nextInt();
		
		int semRefeicao = 0;
		
		if (cR > cA) {
			semRefeicao += cR - cA;
		}
		
		if (bR > bA){
			semRefeicao += bR - bA;
		}
		
		if (pR > pA) {
			semRefeicao += pR - pA;
		}
		
		System.out.println(semRefeicao);
		
		sc.close();

	}

}
