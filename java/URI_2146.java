package URI;
import java.util.Scanner;

public class URI_2146 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			int senha = sc.nextInt();
			System.out.println(senha - 1);
		}		
		
		sc.close();
		
	}

}
