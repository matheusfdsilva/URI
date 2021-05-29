package URI;

import java.util.Arrays;
import java.util.Scanner;

public class URI_1410 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int atac = sc.nextInt();
		int def = sc.nextInt();
						
		while (atac != 0 && def != 0) {
			sc.nextLine();
			int[] atacantes = insertPlayers(atac, sc);
			int[] defensores = insertPlayers(def, sc);
			
			int posAtac = min(atacantes);			
			int posPenultimo = minB(defensores);
						
			boolean impedido = true;
						
			if (posAtac > posPenultimo || posAtac == posPenultimo) {
				impedido = false;
			}
						
			System.out.println(impedido ? "Y" : "N");
			
			atac = sc.nextInt();
			def = sc.nextInt();
		}		
		
		sc.close();		
	}

	private static int minB(int[] defensores) {
		Arrays.sort(defensores);
		return defensores[1];
	}

	private static int min(int[] atacantes) {
		Arrays.sort(atacantes);
		return atacantes[0];
	}

	private static int[] insertPlayers(int atac, Scanner sc) {
		int[] fields = new int[atac];
		for (int i = 0; i < atac; i++) {
			fields[i] = sc.nextInt();
		}
		return fields;
	}
}
