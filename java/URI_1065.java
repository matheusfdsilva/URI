package URI;
import java.util.Scanner;

public class URI_1065 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int totpar = 0;
		
		for(int i = 0; i < 5; i++) {
			int n = sc.nextInt();
			if(n % 2 == 0) {
				totpar += 1;
			}			
		}
		System.out.println(totpar + " valores pares");
		
		sc.close();

	}

}
