package URI;

import java.util.Scanner;

public class URI_1769 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			
			String checkCpf = sc.next();
			String cpf = checkCpf.substring(0, 3) + checkCpf.substring(4, 7) + checkCpf.substring(8, 11);
			String endCpf = "";
			int sumB1 = 0;
			int sumB2 = 0;
			int aux = 10;
			
			for (int i = 1; i <= 9; i++) {
				sumB1 += Integer.parseInt(cpf.charAt(i-1)+"") * i;
				sumB2 += Integer.parseInt(cpf.charAt(i-1)+"") * (aux - i);				
			}
			if (sumB1 % 11 == 10) endCpf += "0";
			else endCpf += sumB1 % 11;
						
			if (sumB2 % 11 == 10) endCpf += "0";
			else endCpf += sumB2 % 11;
						
			if (!endCpf.equals(checkCpf.substring(12))) System.out.println("CPF invalido");
			else System.out.println("CPF valido");
		}	
		
		sc.close();
	}
}
