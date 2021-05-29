package URI;
import java.util.Scanner;

public class URI_1046 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int inicio = sc.nextInt();
		int fim = sc.nextInt();
		int duracao;
		
		if(inicio < fim) {
			duracao = fim - inicio;			
		}
		else {
			duracao = 24 - inicio + fim;
		}
		
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		sc.close();		

	}

}
