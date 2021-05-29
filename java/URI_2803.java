package URI;

import java.util.Scanner;

public class URI_2803 {
	
	public static final String NORT_REGION = "roraima acre amapa amazonas para rondonia tocantins";
			
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String state = sc.nextLine();
			if (NORT_REGION.contains(state)) {
				System.out.println("Regiao Norte");
			}
			else {
				System.out.println("Outra regiao");
			}
		}
		
		sc.close();
	}
}