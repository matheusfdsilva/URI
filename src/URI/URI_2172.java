package URI;
import java.util.Scanner;

public class URI_2172 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int m = sc.nextInt();
		
		while(x != 0 && m != 0) {
			System.out.println(x * m);
			x = sc.nextInt();
			m = sc.nextInt();
		}
		
		
		sc.close();

	}

}
