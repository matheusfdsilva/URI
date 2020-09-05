package URI;
import java.util.Scanner;

public class URI_1864 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String frase = "LIFE IS NOT A PROBLEM TO BE SOLVED";
		
		int mostrar = sc.nextInt();
		System.out.println(frase.substring(0, mostrar));		
		
		sc.close();

	}

}
