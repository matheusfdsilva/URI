package URI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class URI_1251 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int caso = 0;
		
		while (sc.hasNext()) {
			if (caso > 0) {
				System.out.println();
			}
			Map<Integer, Integer> map = new TreeMap<>(Collections.reverseOrder());
			String str = sc.nextLine();
			for (char ch : str.toCharArray()) {
				int codigo = (int) ch;
				if (map.containsKey(codigo)) {
					map.put(codigo, map.get(codigo)+1);
				}
				else {
					map.put(codigo, 1);
				}
			}			
			
			List<Caracteres> list = new ArrayList<>();			
			map.forEach((k, v) -> list.add(new Caracteres(k, v)));		
			
			list.stream().sorted(Comparator.comparing(Caracteres::getFrequencia))
			.forEach(System.out::println);;		
			caso++;
		}
		
		sc.close();
	}
	
	public static class Caracteres {
		
		private int code;
		private int frequencia;
		
		public Caracteres(int code, int frequencia) {
			this.code = code;
			this.frequencia = frequencia;
		}

		public int getFrequencia() {
			return frequencia;
		}

		@Override
		public String toString() {
			return code + " " + frequencia;
		}	
	}	
}
