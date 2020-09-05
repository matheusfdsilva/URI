package URI;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class URI_2846 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		Set<Long> fibonaci = createFibonaci();
		Long[] fibonot = createFibonot(fibonaci, n);
				
		System.out.println(fibonot[n-1]);		
		
		sc.close();

	}
	static Set<Long> createFibonaci() {
		Set<Long> fibonaci = new HashSet<>();
		Long[] vect = new Long[100000];
		vect[0] = 1L;
		vect[1] = 1L;					
		
		for (int i = 2; i < vect.length; i++) {
			Long sum = vect[i-1] + vect[i-2];			
			vect[i] = sum;					
			fibonaci.add(sum);													
		}				
		return fibonaci;
	}
				
	static Long[] createFibonot(Set<Long> fibonaci, int lenght) {
		Long[] fibonot = new Long[lenght];
		int aux = 0;
		long number = 4;
		
		while (aux < fibonot.length) {
			if (!fibonaci.contains(number)) {
				fibonot[aux] = number;
				aux++;
			}
			number++;
		}
		
		return fibonot;		
	}
}
