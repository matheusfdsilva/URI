package URI;
import java.util.Scanner;

public class URI_1589 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t > 0) {
			int r1 = sc.nextInt();
			int r2 = sc.nextInt();
			int conduite = r1 + r2;
			System.out.println(conduite);
			t--;
		}
		
		
		sc.close();

	}

}
