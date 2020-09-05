package URI;
import java.util.Locale;
import java.util.Scanner;

public class URI_1060 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int totpositivo = 0;
		
		for(int i = 0; i < 6; i++) {
			double n = sc.nextDouble();
			if(n > 0) {
				totpositivo += 1;
			}
		}
		
		System.out.println(totpositivo + " valores positivos");				
		
		sc.close();

	}

}
