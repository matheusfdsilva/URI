package URI;
import java.util.Scanner;

public class URI_1146 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		while(n != 0) {
			for(int i = 1; i < n; i++) {
				System.out.print(i + " ");
			}
			System.out.println(n);
			n = sc.nextInt();
		}				
		
		sc.close();

	}

}
