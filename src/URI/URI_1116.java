package URI;
import java.util.Locale;
import java.util.Scanner;

public class URI_1116 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 1 ; i <= n; i++) {
			
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			if(y == 0) {
				System.out.println("divisao impossivel");
			}
			else {
				double divisao = (double) x / y;
				System.out.println(divisao);
			}
						
		}
		
		sc.close();

	}

}