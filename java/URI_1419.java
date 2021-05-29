package URI;

import java.util.Scanner;

public class URI_1419 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int rounds = sc.nextInt();
		
		while (rounds != 0) {
			
			Integer[] mark = createVect(rounds, sc);
			Integer[] leti = createVect(rounds, sc);
			
			int sumMark = mark[rounds];
			int sumLeti = leti[rounds];
						
			String firstSequency = checkSequency(mark, leti);
						
			if (firstSequency != null) {				
				if (firstSequency.equals("Mark")) sumMark += 30;
				else sumLeti += 30;
			}
			
			if (sumMark == sumLeti) {
				System.out.println("T");
			}
			else {
				System.out.println(sumMark > sumLeti ? "M" : "L");
			}			
			
			rounds = sc.nextInt();
		}		
		
		sc.close();		
	}	

	private static Integer[] createVect(int rounds, Scanner sc) {
		Integer[] vect = new Integer[rounds + 1];
		int sum = 0;
		for (int i = 0; i < rounds; i++) {
			vect[i]	= sc.nextInt();
			sum += vect[i];
		}
		vect[rounds] = sum;
		return vect;
	}	

	private static String checkSequency(Integer[] mark, Integer[] leti) {
		int countMark = 1, countLeti = 1;
		boolean statusMark = false,  statusLeti = false;
		for (int i = 1; i < mark.length - 1; i++) {
			statusMark = checkNumber(mark, i);
			statusLeti = checkNumber(leti, i);
			countMark = statusMark ? countMark = countMark + 1 : 1;
			countLeti = statusLeti ? countLeti = countLeti + 1 : 1;
			if (countMark == 3 || countLeti == 3) {
				break;
			}
		}		
		if (countMark == 3 && countLeti == 3 || countMark < 3 && countLeti < 3) return null;
		return countMark == 3 ? "Mark" : "Leti";
	}

	private static boolean checkNumber(Integer[] vect, int i) {
		if (vect[i] == vect[i-1]) return true;
		return false;
	}
}