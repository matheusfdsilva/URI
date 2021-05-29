package URI;

import java.util.Scanner;

public class URI_2762 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String st = sc.next();
		int indexOfPoint = st.indexOf(".");
		int n1 = Integer.parseInt(st.substring(0, indexOfPoint));
		int n2 = Integer.parseInt(st.substring(indexOfPoint+1));
		
		System.out.println(n2 + "." + n1);
		
		sc.close();
	}
}
