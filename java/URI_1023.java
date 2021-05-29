package URI;

import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class URI_1023 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int caso = 1;
		
		while (n != 0) {
			sc.nextLine();
			if (caso > 2) System.out.println();
			
			Map<Integer, Integer> map = new TreeMap<>();
			int consumoTotal = 0;
			int moradoresTotal = 0;
			
			for (int i = 0; i < n; i++) {
				String[] string = sc.nextLine().split(" ");
				int moradores = Integer.parseInt(string[0]);
				moradoresTotal += moradores;
				int consumo = Integer.parseInt(string[1]);
				consumoTotal += consumo;
				
				if (map.containsKey(consumo / moradores)) {
					int consumoAnt = map.get(consumo / moradores);
					map.put(consumo / moradores, moradores + consumoAnt);
				}
				else {
					map.put(consumo / moradores, moradores);
				}			
			}
			
			double mediaConsumo = (double) consumoTotal / moradoresTotal * 100;
			int temp = (int) mediaConsumo;			
			mediaConsumo = temp / 100.0;
			
			System.out.println("Cidade# " + caso + ":");
			String string = "";
			for (Integer key : map.keySet()) {
				string += map.get(key) + "-" + key + " ";
			}
			System.out.println(string);
			System.out.printf("Consumo medio: %.2f m3.\n", mediaConsumo);
			System.out.println();
			caso++;
			
			n = sc.nextInt();
		}
		
		
		sc.close();
	}
}