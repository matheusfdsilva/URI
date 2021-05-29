package URI;

import java.util.Scanner;

public class URI_2486 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		String[]alimentos = new String[] {"suco de laranja","morango fresco","mamao","goiaba vermelha","manga","laranja","brocolis"};
		int[] vitaminas = new int[] {120,85,85,70,56,50,34};										
				
		while (t != 0) {
						
			int vitaminaDiaria = 0;
			
			for (int i = 0; i < t; i++) {
				
				int qtde = sc.nextInt();				
				String alimento = sc.nextLine().trim();				
				
				for (int x = 0; x < alimentos.length; x++) {
					if (alimento.equals(alimentos[x])) {
						vitaminaDiaria += qtde * vitaminas[x];
					}
				}				
			}
			
			if (vitaminaDiaria > 130) {				
				System.out.println("Menos " + (vitaminaDiaria - 130) + " mg");
				
			} else if (vitaminaDiaria < 110){				
				System.out.println("Mais " + (110 - vitaminaDiaria) + " mg");
				
			} else {
				System.out.println(vitaminaDiaria + " mg");
			}
			
			t = sc.nextInt();			
		} 		
		
		sc.close();
	}

}
