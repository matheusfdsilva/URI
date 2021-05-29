package URI;
import java.util.Scanner;

public class URI_1172 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[]vect = new int[10];
		
		for(int i = 0; i < vect.length; i++) {
			int n = sc.nextInt();
			if(n <= 0) {
				vect[i] = 1;
			} else {
				vect[i] = n;
			}
		}
		
		for(int i = 0; i < vect.length; i++) {
			System.out.println("X[" + i + "] = " + vect[i]);
		}
		
		sc.close();

	}

}
