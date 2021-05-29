package URI;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class URI_2493 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Set<String> set = new TreeSet<>();
		
		while (sc.hasNext()) {
			int n = sc.nextInt();
			sc.nextLine();
			String[][] fields = new String[n][3];
			for (int i = 0; i < n; i++) {
				String op = sc.nextLine().replace("=", " ");
				fields[i] = op.split(" ");				
			}			
			
			for (int i = 0; i < n; i++) {
				String name = sc.next();
				int num = sc.nextInt();
				String operacao = sc.next();
				Boolean check = null;
				
				int x = Integer.parseInt(fields[num-1][0]);
				int y = Integer.parseInt(fields[num-1][1]);
				int z = Integer.parseInt(fields[num-1][2]);
				
				if (operacao.equals("+")) check = soma(x, y, z);				
				else if (operacao.equals("-")) check = subtracao(x, y, z);				
				else if (operacao.equals("*")) check = multplicacao(x, y, z);				
				else {
					check = soma(x, y, z);
					if (!check) check = subtracao(x, y, z);
					if (!check) check = multplicacao(x, y, z);
					if (check) set.add(name);
				}
				if (!operacao.equals("I") && !check) set.add(name);
			}
			
			if (set.size() == 0) System.out.println("You Shall All Pass!");
			else if (set.size() == n) System.out.println("None Shall Pass!");
			else {
				int aux = 0;
				for (String str : set) {
					if (aux == set.size()-1) System.out.println(str);
					else System.out.print(str + " ");
					aux++;
				}
			}			
			set.clear();
		}
		
		sc.close();
	}
	
	private static boolean soma(int x, int y, int z) {
		return x + y == z;
	}
	
	private static boolean subtracao(int x, int y, int z) {
		return x - y == z;
	}
	
	private static boolean multplicacao(int x, int y, int z) {
		return x * y == z;
	}
}