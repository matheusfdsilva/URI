package URI;

import java.util.Scanner;

public class URI_1287 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNextLine()) {
			String st = sc.nextLine();			
			String number = "";	
			boolean status = true;
			int pos = 0;
			
			while (status && pos < st.length()) {
				char ch = st.charAt(pos);
				
				if (ch >= '0' && ch <= '9') number += ch;
				else if (ch == 'o' || ch == 'O') number += 0;
				else if (ch == 'l') number += 1;
				else if (ch != ' ' && ch != ',') status = false;
				pos++;
			}
			
			if (!number.isEmpty()) number = removeZeros(number);
			
			if (number.isEmpty() || !status || number.length() > 10) System.out.println("error");
			else {
				Long l = Long.parseLong(number);
				if (l > 2147483647) System.out.println("error");
				else System.out.println(l);
			}
		}
		
		sc.close();
	}	
	static String removeZeros(String number) {
					
		if (number.charAt(0) == '0') {
			int temp = 1;
			while (temp < number.length()) {
				if (number.charAt(temp) != '0') {
					number = number.substring(temp);
					temp = number.length();
				}
				temp++;
			}	
		}
		return number;
	}
}