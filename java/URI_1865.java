package URI;
import java.util.Scanner;

public class URI_1865 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		while(n > 0) {
			String name = sc.next();
			int forca = sc.nextInt();
			if (name.equals("Thor")) {
				System.out.println("Y");
			} else {
				System.out.println("N");
			}
			n--;
		}		
		
		sc.close();

	}

}
