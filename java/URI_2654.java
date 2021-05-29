package URI;

import java.util.Scanner;

public class URI_2654 {

	public static String godofor = null;
	public static int maiorPoder = 0, maiorKill = 0, menasMorte = 0;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();				
		
		for (int i = 0; i < n; i++){
			String nome = sc.next();
			int poder = sc.nextInt();
			int kills = sc.nextInt();
			int mortes = sc.nextInt();
			
			if (i == 0) {
				godofor = nome;
			}
			
			if (poder > maiorPoder) {
				changeDados(nome, poder, kills, mortes);
			}
			else if (poder == maiorPoder) {
				if (kills > maiorKill) {
					changeDados(nome, poder, kills, mortes);
				}
				else if (kills == maiorKill) {
					if (mortes < menasMorte) {
						menasMorte = mortes;
						godofor = nome;
					}
					else if (mortes == menasMorte && nome.compareTo(godofor) < 0) {					
						godofor = nome;												
					}
				}
			}			
		}		
		
		System.out.println(godofor);
		
		sc.close();
	}	
	
	private static void changeDados(String newName, int newPower, int newKill, int newMorte) {
		godofor = newName;
		maiorPoder = newPower;
		maiorKill = newKill;
		menasMorte = newMorte;	
	}	
}