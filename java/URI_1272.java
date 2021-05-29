package URI;

import java.util.Scanner;

public class URI_1272 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < n; i++) {
			String line = sc.nextLine();
			String[]fields = line.split(" ");
						
			String ocultMsg = "";
			for (String string : fields) {
				for (char ch : string.toCharArray()) {
					if(Character.isAlphabetic(ch)) {
						ocultMsg += ch;
						break;
					}
				}
			}
			
			System.out.println(ocultMsg);			
		}		
		
		sc.close();
	}
}
