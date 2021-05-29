package URI;

import java.util.Scanner;

public class URI_2690 {
	
	public static final String[] fields = new String[] {"GQaku","ISblv","EOYcmw","FPZdnx","JTeoy","DNXfpz","AKUgq","CMWhr","BLVis","HRjt"};
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();		
		sc.nextLine();
		
		for (int i = 0; i < n; i++) {
			String str = sc.nextLine().replace(" ","");
			String password = "";
			for (int k = 0; k < str.length(); k++) {
				for (int j = 0; j < fields.length; j++) {
					if (fields[j].contains(str.charAt(k)+"") && password.length() < 12) {
						password += j;
						break;
					}
				}
			}
			
			System.out.println(password);
		}			
		
		sc.close();
	}
}