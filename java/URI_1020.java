package URI;
import java.util.Scanner;

public class URI_1020 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N, dias, meses, anos, resto;
		
		N = sc.nextInt();
		
		anos = N / 365;
		System.out.println(anos + " ano(s)");
		resto = N % 365;
		meses = resto / 30;
		System.out.println(meses + " mes(es)");
		dias = resto % 30;
		System.out.println(dias + " dia(s)");							
				
		sc.close();		
	}

}
