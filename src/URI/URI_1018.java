package URI;
import java.util.Scanner;

public class URI_1018 {

	public static void main(String[] args) {		 
		 Scanner sc = new Scanner(System.in);
		 
		 int N, qtde;
		 int[]cedulas = new int[] {100, 50, 20, 10, 5, 2, 1};
		 
		 N = sc.nextInt();
		 
		 System.out.println(N);			 
		 for(int notas : cedulas) {			
			 qtde = N / notas;
			 N = N % notas;			 
			 System.out.printf("%d nota(s) de R$ %d,00%n", qtde, notas);
		 }			 				 
		 sc.close(); 		 
	}

}
