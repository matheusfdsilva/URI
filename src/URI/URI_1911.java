package URI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class URI_1911 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		List<String> nomes = new ArrayList<>();		
		
		while (n != 0) {			
			for (int i = 0; i < n; i++) {
				nomes.add(sc.next());
				nomes.add(sc.next());
			}
			
			int m = sc.nextInt();
			int assinaturasFalsas = 0;
			for (int i = 0; i < m; i++) {
				int count = 0;
				String nomeAluno = sc.next();
				String assinaturaAula = sc.next();
				if (nomes.contains(nomeAluno)) {
					int indexAssinatura = nomes.indexOf(nomeAluno) + 1; // + 1 pq a assinatura fica um indice a mais do nome
					String assinaturaOriginal = nomes.get(indexAssinatura);
					for (int k = 0; k < assinaturaOriginal.length(); k++) {
						if (assinaturaAula.charAt(k) != assinaturaOriginal.charAt(k)) {
							count++;
						}
					}
					if (count > 1) {
						assinaturasFalsas++;
					}
				}
			}
			System.out.println(assinaturasFalsas);
			nomes.clear();			
			n = sc.nextInt();
		}
		
		sc.close();
	}
}