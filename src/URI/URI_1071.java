package URI;
import java.util.Scanner;

public class URI_1071 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int sum = 0;
		
		for(int i = x - 1; i >= y + 1; i--) {
			if(i % 2 != 0) {
				sum += i;
			}			
		}
		System.out.println(sum);
		
		
		sc.close();

	}

}
