package URI;
import java.util.Scanner;

public class URI_2057 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int s = sc.nextInt();		
		int t = sc.nextInt();		
		int f = sc.nextInt();		
		
		int duracao = s + t + f;
		if (duracao > 24) {
			duracao -= 24;
		} else if(duracao < 0) {
			duracao = 24 - duracao * - 1;
		}
		System.out.println(duracao);	
		
		sc.close();	
	}

}
