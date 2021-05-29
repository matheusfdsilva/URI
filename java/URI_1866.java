package URI;
import java.util.Scanner;

public class URI_1866 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num;

		for (int i = 0; i < n; i++) {
			num = sc.nextInt();
			
			if (num % 2 == 0) {				
				System.out.println(0);
				
			} else {				
				System.out.println(1);	            
	        }
		}
		sc.close();

    }
}
