package URI;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class URI_2951 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int runes = sc.nextInt();
		int friendShipNecessary = sc.nextInt();
		Map<Character, Integer> map = new HashMap<>();
		
		for (int i = 0; i < runes; i++) {
			char rune = sc.next().charAt(0);
			int value = sc.nextInt();
			map.put(rune, value);
		}
		
		int runesFrodo = sc.nextInt();
		int friendShipFrodo = 0;
		for (int i = 0; i < runesFrodo; i++) {
			char runeFrodo = sc.next().charAt(0);
			if (map.containsKey(runeFrodo)) friendShipFrodo += map.get(runeFrodo);
		}
		
		System.out.println(friendShipFrodo);
		if (friendShipFrodo >= friendShipNecessary) System.out.println("You shall pass!");
		else System.out.println("My precioooous");
		
		sc.close();
	}
}
