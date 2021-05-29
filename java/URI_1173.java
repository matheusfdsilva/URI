package URI;
import java.util.Scanner;

public class URI_1173 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[]vect = new int[10];
		
		for(int i = 0; i < vect.length; i++) {
			vect[i] = n;
			n *= 2;
		}
				
		for(int i = 0; i < vect.length; i++) {
			System.out.println("N[" + i + "] = " + vect[i]);
		}
		
		
		sc.close();

	}

}
