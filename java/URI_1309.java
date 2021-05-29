package URI;

import java.util.Scanner;

public class URI_1309 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String dolares = sc.next();
			String cents = sc.next();
						
			if (cents.length() == 1) dolares += "0" + cents;
			else dolares += cents;
			
			if (dolares.length() > 3 && dolares.contains("0")) dolares = removeZeros(dolares);
			
			StringBuilder sb = firstNumber(dolares);
			System.out.println(sb.toString());						
		}
				
		sc.close();
	}

	static String removeZeros(String password) {
		boolean status = true;
		String temp = "";
		int aux = 0;	
		
		while (status) {
			if (password.charAt(aux) != '0') {
				temp = password.substring(aux);
				status = false;
			}			
			aux++;
		}
		return temp;		
	}
	
	static StringBuilder firstNumber(String dolares) {
		StringBuilder sb = new StringBuilder();
		sb.append("$");
		int aux = 0;
		
		if ((dolares.length() -2) % 3 != 0) { // dolares.length()-2 pq eu ainda nao estou considerando os centavos e % 3 para eu saber até onde dar o substring
			sb.append(dolares.substring(0, (dolares.length()-2) % 3)); 
			if (dolares.length() > 4) sb.append(",");
			else sb.append(".");
			aux = (dolares.length()-2) % 3;
		}
		return fullNumber(dolares, aux, sb);
	}
	
	static StringBuilder fullNumber(String dolares, int aux, StringBuilder sb) {
		// dolares.length() - 5 por que eu ainda n estou considerando os centavos (2 casas) e os outros 3 é para eu conseguir fazer o substring(i + 3)
		for (int i = aux; i <= dolares.length()-5; i+=3) {
			sb.append(dolares.substring(i, i+3));
			if (i < dolares.length() - 5) sb.append(",");
			else sb.append(".");
		}
					
		sb.append(dolares.substring(dolares.length()-2));		
		
		return sb;		
	}	
}