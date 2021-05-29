package URI;

import java.util.Scanner;

public class URI_1536 {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int mandante1, mandante2, visitante1, visitante2;
		
		for (int i = 0; i < n; i++) {
			mandante1 = sc.nextInt();
			sc.next();
			visitante1 = sc.nextInt();
			mandante2 = sc.nextInt();
			sc.next();
			visitante2 = sc.nextInt();
			
			String result = howWin(mandante1, mandante2, visitante1, visitante2);
			System.out.println(result);
		}		
		
		sc.close();
	}

	private static String howWin(int mandante1, int mandante2, int visitante1, int visitante2) {
		if (mandante1 + visitante2 > visitante1 + mandante2) {
			return "Time 1";
		}
		if (mandante1 + visitante2 < visitante1 + mandante2) {
			return "Time 2";
		}
		if (mandante1 + visitante2 == visitante1 + mandante2) {
			int saldoTime1 = mandante1-visitante1;
			int saldoTime2 = mandante2-visitante2;
			if (saldoTime1 > saldoTime2 || visitante1 < visitante2) {				
				return "Time 1";
			}
			if (saldoTime1 < saldoTime2 || visitante2 < visitante1) {
				return "Time 2";
			}				
		}
		return "Penaltis";
	}
}