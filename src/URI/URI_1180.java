package URI;
import java.util.Scanner;

public class URI_1180 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tamanho = sc.nextInt();
		int[]vetor = new int[tamanho];
		
		int n = sc.nextInt();
		vetor[0] = n;
		int menor = vetor[0];
		int posicao = 0;
		
		for(int i = 1; i < vetor.length; i++) {
			n = sc.nextInt();
			vetor[i] = n;			
			
			if(vetor[i] < menor) {
				menor = vetor[i];
				posicao = i;
			}			
		}
		System.out.println("Menor valor: " + menor);
		System.out.println("Posicao: " + posicao);			
		
		sc.close();		

	}

}
