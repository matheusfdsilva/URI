package URI;
import java.util.Scanner;

public class URI_1962 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			int anos = sc.nextInt();
			int T;
			
			if (anos > 2015 || anos == 2015) {
				T = anos - 2014;
				System.out.println(T + " A.C.");
			} else {
				T = Math.abs(anos - 2015);
				System.out.println(T + " D.C.");
			}
		}		
		
		
		sc.close();

	}

}
