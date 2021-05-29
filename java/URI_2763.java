package URI;

import java.util.Scanner;

public class URI_2763 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
						
		String cpf = sc.next();		
		String[] dig = cpf.replace(".","-").split("-");
		
		for (String string : dig) {
			System.out.println(string);
		}			
		sc.close();
	}
}
