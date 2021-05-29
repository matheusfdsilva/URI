package URI;

import java.util.Scanner;

public class URI_2176 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String paridade = sc.next();
		int contBits = 0;
		
		for (int i = 0; i < paridade.length(); i++) {
			if (paridade.charAt(i) == '1')	contBits++;			
		}
		
		if (contBits % 2 == 0) 	paridade += "0";
		else paridade += "1";
				
		System.out.println(paridade);
		
		sc.close();

	}

}
