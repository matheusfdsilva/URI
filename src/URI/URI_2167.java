package URI;
import java.util.Scanner;

public class URI_2167 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] rpm = new int[n];
		int posicao = 0;
		
		for (int i = 0; i < n; i++) {
			rpm[i] = sc.nextInt();			
						
			if (i >= 1 && rpm[i] < rpm[i - 1]) {
				posicao = i + 1;
				break;
			} 
		}		
		
		System.out.println(posicao);
		
		sc.close();
	}

}
