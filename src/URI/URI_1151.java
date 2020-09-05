package URI;
import java.util.Scanner;

public class URI_1151 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int t1 = 0; int t2 = 1;
		System.out.print(t1 + " ");
		System.out.print(t2 + " ");		
				
		for(int i = 3; i <= n; i++) {	
			int t3 = t1 + t2;
			if(i == n) {
				System.out.println(t3);
			}
			else {
				System.out.print(t3 + " ");				
			}			
			t1 = t2;
			t2 = t3;				
		}
		
		
		
		
		
		sc.close();

	}

}
