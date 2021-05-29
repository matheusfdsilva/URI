package URI;

import java.util.Scanner;

public class URI_1237 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String string = sc.nextLine();
			String st = sc.nextLine();
			
			int lenght = greaterSubstring(string, st);
			System.out.println(lenght);
		}
		
		sc.close();

	}
	static int greaterSubstring(String a, String b) {
		int maiorSub = 0;
		String aux = "";
		int temp = 0;
		
		for (int i = 0; i <b.length(); i++) {
			
			if (a.contains(aux + b.charAt(i))) {				
				aux += b.charAt(i);
			}
			else {
				if (aux.length() != temp && maiorSub >= 1) {
					if (aux.length() > maiorSub) maiorSub = aux.length();
					temp = aux.length() + 1;
					aux = b.charAt(i-1)+"" + b.charAt(i)+"";					
				}
				else if (aux.length() != temp && maiorSub == 0) {
					maiorSub = aux.length();
					temp = aux.length()+1;
					aux = b.charAt(i-1)+"" + b.charAt(i)+"";	
				}
				else aux = "";
			}
		}
		if (aux.length() > maiorSub) maiorSub = aux.length();
		
		return maiorSub;
	}
}
