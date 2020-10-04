package URI;

import java.util.Scanner;

public class URI_2153 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String string = sc.next();
			String temp = null;
			StringBuilder sb = new StringBuilder();			
			for (int i = string.length()-1; i >= 0; i--) {
				temp = string.substring(0, i);
				sb.append(string.charAt(i)).reverse();
				if (temp.contains(sb)) {					
					sb.reverse();
				}
				else {
					temp = string.substring(0 ,i+1);	
					break;							
				}							
			}
			System.out.println(temp);
		}		
		
		sc.close();
	}
}