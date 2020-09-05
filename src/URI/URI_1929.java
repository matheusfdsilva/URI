package URI;
import java.util.Scanner;

public class URI_1929 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c, d;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		if(a < b + c && b < a + c && c < a + b) {
			System.out.println("S");
		} else if(a < b + d && b < a + d && d < a + b) {
			System.out.println("S");
		} else if(a < c + d && c < a + d && d < a + c) {
			System.out.println("S");
		} else if(b < c + d && c < d + b && d < c + b) {
			System.out.println("S");
		} else {
			System.out.println("N");
		}
				
		
		sc.close();

	}

}
