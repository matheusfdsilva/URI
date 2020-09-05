package URI;

import java.util.Scanner;

public class URI_2569 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String st = sc.nextLine();
		
		String[] x = st.replace("7", "0").split(" ");		
		String a = x[0];
		String b = x[2];
		
		int result;
		if (x[1].equals("+")) {
			result = Integer.parseInt(a) + Integer.parseInt(b);
		}
		else {
			result = Integer.parseInt(a) * Integer.parseInt(b);
		}
		
		String resultSt = String.valueOf(result).replace("7", "0");
		int finalResult = Integer.parseInt(resultSt);
		System.out.println(finalResult);		
		
		sc.close();

	}
}
