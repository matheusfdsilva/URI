package URI;

import java.util.Scanner;

public class URI_1228 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[]largada;
		String[]chegada;
		
		while (sc.hasNext()) {
			sc.nextInt();
			sc.nextLine();
			
			largada = sc.nextLine().split(" ");
			chegada = sc.nextLine().split(" ");
			
			int moves = 0;			
			
			for (int i = 0; i < largada.length; i++) {
				for (int j = i; j < chegada.length; j++) {
					if (largada[i].equals(chegada[j]) && j != i) {						
						while (!largada[i].equals(chegada[i])) {
							String temp = chegada[j-1];
							chegada[j-1] = chegada[j];
							chegada[j] = temp;
							moves++;
							j--;
						}							
						break;
					}
				}				
			}	
			
			System.out.println(moves);
		}	
		
		
		sc.close();
	}
}