package URI;
import java.util.Scanner;

public class URI_2140 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] notas = new int[] {100, 50, 20, 10, 5, 2};
		
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int troco = m - n;
		
		while (n != 0 && m != 0) {
			int totNotas = 0;
			for (int obj : notas) {
				totNotas += troco / obj;
				troco = troco % obj;				
			}
			
			if (totNotas == 2) {
				System.out.println("possible");
			} else {
				System.out.println("impossible");
			}
			
			n = sc.nextInt();
			m = sc.nextInt();		
			troco = m - n;
		}
		
		
		sc.close();
	}

}
