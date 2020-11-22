package URI;

import java.util.Scanner;

public class URI_1728 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			StringBuilder sb = new StringBuilder();
			String turing = sc.next();
			sb.append(turing);			
			sb.setCharAt(sb.indexOf("+"), ' ');
			sb.setCharAt(sb.indexOf("="), ' ');
			sb.reverse();
			String[]fields = sb.toString().split(" ");
			
			System.out.println(isTrue(fields));					
		}
		
		sc.close();	
	}

	private static String isTrue(String[] fields) {
		int result = Integer.parseInt(fields[0]);
		int a = Integer.parseInt(fields[1]);
		int b = Integer.parseInt(fields[2]);
		return a + b == result ? "True" : "False";
	}
}