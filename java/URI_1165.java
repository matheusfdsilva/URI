package URI;
import java.util.Scanner;

public class URI_1165 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			int num = sc.nextInt();
			int totdiv = 0;
			
			for(int t = 1; t <= num; t++) {
				if(num % t == 0) {
					totdiv += 1;					
				}				
			}
			if (totdiv == 2) {
				System.out.println(num + " eh primo");
			} else {
				System.out.println(num + " nao eh primo");
			}
			
		}
		
		
		sc.close();

	}

}
