package URI;

import java.util.Arrays;
import java.util.Scanner;

public class URI_3041 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();		
				
		while (n != 0) {
			int[] readArticles = new int[n];
			int[] articles = new int[n];
			int totArticles = 0;
			for (int i = 0; i < n; i++) {	
				int articlesPerReader = sc.nextInt();
				articles[i] = articlesPerReader;				
				totArticles += articlesPerReader;
			}
			int articlesToDistributed = sc.nextInt();						
			
			if (articlesToDistributed <= totArticles) {	
				Arrays.sort(articles);
				int aux = articles.length-1;					
				
				while (totArticles != 0 && articlesToDistributed != 0) {					
					if (articles[aux] != 0) {
						articles[aux] -= 1;
						readArticles[aux] += 1;
						totArticles -= 1;
						articlesToDistributed -= 1;
					}									
					aux --;
					
					if (aux == -1) {
						aux = articles.length - 1;
					}								
				}
			}			
			
			if (articlesToDistributed == 0) {
				Arrays.sort(readArticles);
				for (int k = readArticles.length-1; k >= 0; k--) {
					System.out.println(readArticles[k]);
				}
			}
			else {
				System.out.println("Impossible");
			}			
			
			n = sc.nextInt();
		}				
		
		sc.close();
	}
}