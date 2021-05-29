package URI;

import java.util.Scanner;

public class URI_2542 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			sc.nextInt();
			int m = sc.nextInt();
			int l = sc.nextInt();
			sc.nextLine();
			String[] marcos = createDeck(m, sc);
			String[] leonardo = createDeck(l, sc);
			
			int choiceCardMarcos = sc.nextInt();
			int choiceCardLeonardo = sc.nextInt();
			int sortedAtribute = sc.nextInt();
			
			int atributeMarcos = Integer.parseInt(marcos[choiceCardMarcos-1].split(" ")[sortedAtribute-1]);
			int atributeLeonardo = Integer.parseInt(leonardo[choiceCardLeonardo-1].split(" ")[sortedAtribute-1]);
			
			if (atributeMarcos == atributeLeonardo) {
				System.out.println("Empate");
			}
			else {
				System.out.println(atributeMarcos > atributeLeonardo ? "Marcos" : "Leonardo");
			}			
		}		
		
		sc.close();
	}
	
	public static String[] createDeck(int cards, Scanner sc) {
		String[] deck = new String[cards];
		for (int i = 0; i < cards; i++) {
			deck[i] = sc.nextLine();
		}
		return deck;
	}
}