package URI;
import java.util.Scanner;

public class URI_1073 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		for(int i = 2; i <= n; i += 2) {
			System.out.println(i + "^2 = " + i * i);			
		}
		
		
		sc.close();

	}

}
