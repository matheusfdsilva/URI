package URI;
import java.util.Scanner;

public class URI_1047 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
						
		int horaInicial = sc.nextInt();
		int minutoInicial = sc.nextInt();
		int horaFinal = sc.nextInt();
		int minutoFinal = sc.nextInt();
		
		int instanteInicial = horaInicial * 60 + minutoInicial;
		int instanteFinal = horaFinal * 60 + minutoFinal;
		
		int duracao;
		
		if(instanteFinal > instanteInicial) {
			duracao = instanteFinal - instanteInicial;
		}
		else {
			duracao = 24 * 60 - instanteInicial + instanteFinal;
		}
		
		int horas = duracao / 60;
		int minutos = duracao % 60;
		
		System.out.println("O JOGO DUROU " + horas + " HORA(S) E " + minutos + " MINUTO(S)");		
		
		sc.close();
	}

}
