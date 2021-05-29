package URI;

import java.util.Scanner;

public class URI_1430 {
	
	private static String ids = "WHQESTX";	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String compasso = sc.next();
		
		while (!compasso.equals("*")) {
			String[] compassos = compasso.replaceFirst("/", "").split("/");
			int correct = 0;			
			
			for (int i = 0; i < compassos.length; i++) {
				double time = 0;
				for (int k = 0; k < compassos[i].length(); k++) {
					char ch = compassos[i].charAt(k);
					double duracao = 1 / (Math.pow(2, ids.indexOf(ch)));
					time += duracao;					
				}
				if (time == 1) {
					correct++;
				}				
			}			
			System.out.println(correct);
			compasso = sc.next();
		}
		
		sc.close();
	}
}