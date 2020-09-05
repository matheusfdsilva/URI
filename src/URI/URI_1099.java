package URI;
import java.util.Scanner;

public class URI_1099 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			int sum = 0;
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			if(x > y) {
				for(int t = x - 1; t > y; t--) {
					if(t % 2 != 0) {
						sum += t;
					}					
				}				
			}
			else {
				for(int l = y - 1; l > x; l--) {
					if(l % 2 != 0) {
						sum += l;
					}
				}
			}
			System.out.println(sum);
		}
		
		sc.close();

	}

}
