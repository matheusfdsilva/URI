package URI;
import java.util.Scanner;

public class URI_1144 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();		
		
		for(int i = 1; i <= n ; i++) {			
			int segundo = i * i;
			int terceiro = segundo * i;
			System.out.printf("%d %d %d\n", i, segundo, terceiro);
			System.out.printf("%d %d %d\n", i, segundo + 1, terceiro + 1);			
		}		
		
		sc.close();

	}

}
