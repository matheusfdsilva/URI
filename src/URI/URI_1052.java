package URI;
import java.util.Scanner;

public class URI_1052 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		String[] meses = new String[] {"", "January", "February", "March", "April", "May", "June",
									  "July", "August", "September", "October", "November", "December"};
							
		int n = sc.nextInt();
		System.out.println(meses[n]);				
					
		sc.close();

	}

}
