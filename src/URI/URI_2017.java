package URI;

import java.util.Scanner;

public class URI_2017 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String string = sc.next();
		int n = sc.nextInt();		
		
		int index = 0;
		int dif = string.length();
		
		for (int i = 0; i < 5; i++) {
			String str = sc.next();
			int difStr = 0;			
			for (int k = 0; k < str.length(); k++) {
				if (str.charAt(k) != string.charAt(k)) {
					difStr++;
				}				
			}	
			if (difStr < dif) {
				dif = difStr;
				index = i + 1;
			}
		}
		
		System.out.println(dif > n ? -1 : index +"\n"+dif);				
		
		sc.close();
	}
}