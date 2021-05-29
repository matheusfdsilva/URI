package URI;

import java.util.Scanner;

public class URI_1024 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < n; i++) {
			String st = sc.nextLine();
			String newSt = "";
			double center =  Math.ceil(st.length() / 2.0);			
			
			for (int x = st.length()-1; x >= 0; x--) {			
				char temp = st.charAt(x);
				if (Character.isAlphabetic(temp)) {					
					temp += 3;					
				}
				if (x < center) {
					temp -= 1;
				}
				newSt += temp;
			}
			
			System.out.println(newSt);			
		}				
		
		sc.close();
	}
}
