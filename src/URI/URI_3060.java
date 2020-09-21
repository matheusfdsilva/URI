package URI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class URI_3060 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		List<Integer> list = new ArrayList<>();		
		int valorPorParcela, temp = 0;
		
		int valor = sc.nextInt();
		int parcelas = sc.nextInt();			
		
		while (valor != 0) {	
			valorPorParcela = valor / parcelas;
			if (valor % parcelas == 0) {				
				temp = parcelas;				
				valor = 0;
			}			
			else {
				temp = valor % parcelas;
				valorPorParcela++;					
				valor -= valorPorParcela * temp;
				parcelas -= temp;
			}
			
			insert(list, valorPorParcela, temp);
		}
		
		for (Integer parcela : list) {
			System.out.println(parcela);
		}
		
		sc.close();		
	}
	
	private static void insert(List<Integer> list, int valorPorParcela, int parcelas) {
		for (int i = 0; i < parcelas; i++) {
			list.add(valorPorParcela);
		}
	}
}