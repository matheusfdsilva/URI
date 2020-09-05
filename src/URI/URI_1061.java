package URI;
import java.util.Scanner;

public class URI_1061 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int W, W2, X, X2, Y, Y2, Z, Z2, dias, minutos, horas, segundos, resto;
		String doisponto, dia;
		
		dia = sc.next();
		W = sc.nextInt();
		X = sc.nextInt();
		doisponto = sc.next();
		Y = sc.nextInt();
		doisponto = sc.next();
		Z = sc.nextInt();		
		int duracaoInicio = W * 24 * 60 * 60 + X * 60 * 60 + Y * 60 + Z; // convertendo todo o tempo para segundos
		dia = sc.next();
		W2 = sc.nextInt();
		X2 = sc.nextInt();
		doisponto = sc.next();
		Y2 = sc.nextInt();
		doisponto = sc.next();
		Z2 = sc.nextInt();
		int duracaoFim = W2 * 24 * 60 * 60 + X2 * 60 * 60 + Y2 * 60 + Z2;
		int duracao = duracaoFim - duracaoInicio;
		
		
		dias = duracao / (24 * 60 * 60); // quantidade de segundos de que tem em um dia
		resto = duracao % (24 * 60 * 60);
		horas = resto / (60 * 60); // quantidade de segundos em uma hora
		resto = resto % (60 * 60);
		minutos = resto / 60;
		segundos = resto % 60;
		
		System.out.println(dias + " dia(s)");
		System.out.println(horas + " hora(s)");
		System.out.println(minutos + " minuto(s)");
		System.out.println(segundos + " segundo(s)");			
				
		sc.close();

	}

}
