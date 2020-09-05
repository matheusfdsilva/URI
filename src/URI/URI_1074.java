package URI;
import java.util.Scanner;

public class URI_1074 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		
		int n = sc.nextInt();		
		for(int i = 1; i <= n ; i ++) {			
			int x = sc.nextInt();
			
			if(x < 0) {				
				if(x % 2 == 0) {
					System.out.println("EVEN NEGATIVE");
				}
				else {
					System.out.println("ODD NEGATIVE");
				}
			}			
			else if(x > 0) {
				if(x % 2 == 0) {
					System.out.println("EVEN POSITIVE");
				}
				else {
					System.out.println("ODD POSITIVE");
				}
			}			
			else {
				System.out.println("NULL");
			}
			
		}
		
		sc.close();

	}

}