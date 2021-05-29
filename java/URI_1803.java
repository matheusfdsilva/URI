package URI;

import java.util.Scanner;

public class URI_1803 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		StringBuilder decoded = new StringBuilder();	
		String[][] matring;
		
		String str = sc.next();
		
		matring = new String[4][str.length()];
		matring[0] = str.split("");
		
		for (int i = 1; i <= 3; i++) {
			str = sc.next();
			matring[i] = str.split("");
		}
		
		decodeMatring(matring, decoded);	
		System.out.println(decoded.toString());
		
		sc.close();

	}

	private static void decodeMatring(String[][] matring, StringBuilder decoded) {
		Integer start = Integer.parseInt(matring[0][0] + matring[1][0] + matring[2][0] + matring[3][0]);
		Integer finish = Integer.parseInt(matring[0][matring[0].length-1] + matring[1][matring[0].length-1] + matring[2][matring[0].length-1] + matring[3][matring[0].length-1]);
		
		for (int i = 1; i < matring[0].length-1; i++) {
			decoded.append(originalChar(start, finish, matring, i));
		}		
	}

	private static Character originalChar(Integer start, Integer finish, String[][] matring, int i) {
		Integer num = Integer.parseInt(matring[0][i] + matring[1][i] + matring[2][i] + matring[3][i]);
		return (char) ((start * num + finish) % 257);
	}
}
