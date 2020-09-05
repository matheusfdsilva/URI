package URI;
import java.util.Scanner;

public class URI_1101 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		while(M > 0 && N > 0) {
			int sum = 0;
			if(M < N) {
				for(int i = M; i <= N; i++) {
					System.out.print(i + " ");
					sum += i;
				}				
			}
			else {
				for(int i = N; i <= M; i++) {
					System.out.print(i + " ");
					sum += i;
				}
			}
			System.out.println("Sum="+ sum);
			M = sc.nextInt();
			N = sc.nextInt();
		}
		
		sc.close();

	}

}
