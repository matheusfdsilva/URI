package URI;
import java.util.Scanner;

public class URI_1176 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long[]fibo = new long[61];
		
		fibo[0] = 0;
		fibo[1] = 1;
		
		for(int i = 2 ; i < fibo.length; i++) {
			fibo[i] = fibo[i-1] + fibo[i - 2];			
		}
		
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			int mostrar = sc.nextInt();
			System.out.println("Fib(" + mostrar + ") = " + fibo[mostrar]);
		}
		
		sc.close();

	}

}
