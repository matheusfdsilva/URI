package URI;

import java.util.Scanner;

public class URI_2712 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			String day = null;
			boolean correct = false;
			String placa = sc.next();
			if (placa.length() == 8) {
				correct = checkPlaca(placa);								
			}
			
			if (correct) day = checkDay(placa);
			else day = "FAILURE";			
			System.out.println(day);
		}
		
		sc.close();
	}

	private static String checkDay(String placa) {
		if (placa.endsWith("1") || placa.endsWith("2")) return "MONDAY";
		if (placa.endsWith("3") || placa.endsWith("4")) return "TUESDAY";
		if (placa.endsWith("5") || placa.endsWith("6")) return "WEDNESDAY";
		if (placa.endsWith("7") || placa.endsWith("8")) return "THURSDAY";		
		return "FRIDAY";		
	}

	private static boolean checkPlaca(String placa) {
		int letters = 0, numbers = 0;
		for (char ch : placa.toCharArray()) {
			if (Character.isUpperCase(ch)) {
				letters++;
			}
			if (letters == 3 && Character.isDigit(ch)) {
				numbers++;
			}
		}
		if (letters == 3 & numbers == 4) return true;
		return false;
	}	
}