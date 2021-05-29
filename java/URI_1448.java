package URI;

import java.util.Scanner;

public class URI_1448 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		
		for (int x = 1; x <= n; x++) {
			
			String originalString = sc.nextLine();
			String team1 = sc.nextLine();			
			int[] answersTeam1 = checkAnswer(originalString, team1);
			
			String team2 = sc.nextLine();
			int[] answersTeam2 = checkAnswer(originalString, team2);				
			
			System.out.println("Instancia " + x);
			System.out.println(winner(answersTeam1, answersTeam2));
			System.out.println();
		}
		
		sc.close();

	}
	static int[] checkAnswer(String original, String team) {
		// if correct answer = 1 else = 0
		int[] vect = new int[original.length()];
		int aux = 0;
		for (char obj : team.toCharArray()) {
			if (obj == original.charAt(aux)) {
				vect[aux] = 1;
			}			
			aux++;
		}
		return vect;		
	}
	
	static String winner(int[] team1, int[]team2) {	
		int scoreTeam1 = 0;
		int scoreTeam2 = 0;
		
		for (int i = 0; i < team1.length; i++) {
			if (team1[i] == 1) scoreTeam1++;
			if (team2[i] == 1) scoreTeam2++;
		}
		
		if (scoreTeam1 > scoreTeam2) {
			return "time 1";
		}
		
		if (scoreTeam2 > scoreTeam1) {
			return "time 2";
		}
		
		// tieBreaker case
		for (int i = 0; i < team1.length; i++) {
			if (team1[i] == 0 && team2[i] == 1) {
				return "time 2";
			}
			if (team2[i] == 0 && team1[i] == 1) {
				return "time 1";
			}			
		}		
		
		return "empate";		
	}
}
