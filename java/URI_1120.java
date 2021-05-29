package URI;

import java.util.Scanner;

public class URI_1120 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String remove = sc.next();
		String string = sc.next();
		
		while (!remove.equals("0") || !string.equals("0")) {				
			String temp = string;
			
			if (string.contains(remove)) temp = string.replace(remove, "");	
			if (temp.equals("")) temp = "0";
			if (temp.contains("0")) temp = removeZeros(temp);			
			
			System.out.println(temp);
			
			remove = sc.next();
			string = sc.next();
		}		
		
		sc.close();

	}
	
	static String removeZeros(String temp) {
		int indexLastZero = 0;		
		
		for (int i = 0; i < temp.length(); i++) {
			if (temp.charAt(i) != '0') {
				indexLastZero = i;
				break;
			}			
		}
		if (indexLastZero == 0) return temp = "0";
				
		return temp = temp.substring(0, indexLastZero).replace("0", "") + temp.substring(indexLastZero);
	}
}
