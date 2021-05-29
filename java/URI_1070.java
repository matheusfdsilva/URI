package URI;
import java.util.Scanner;

public class URI_1070 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int cont = 0;
		
		for(int i = n; cont < 6; i++) {
			if(i % 2 != 0) {
				System.out.println(i);
				cont += 1;
			}
		}
		
		sc.close();

	}

}
