package URI;
import java.util.Scanner;

public class URI_1177 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int aux = 0;		
		int[]vetor = new int[1000];
		
		for(int i = 0; i < vetor.length; i++) {
			vetor[i] = aux;
			aux += 1;
			if(aux == n) {
				aux = 0;
			}
			System.out.println("N[" + i + "] = " + vetor[i] );
		}				
		
		
		sc.close();

	}

}
