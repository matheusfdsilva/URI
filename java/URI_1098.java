package URI;
import java.util.Locale;

public class URI_1098 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		double i = 0;
		double j = 1;
		
		while(i <= 2) {
			if(i == 0 || i == 1.0 || i > 1.8) {
				System.out.printf("I=%.0f J=%.0f%n", i, j);
				System.out.printf("I=%.0f J=%.0f%n", i, j+1);
				System.out.printf("I=%.0f J=%.0f%n", i, j+2);								
			}
			else {
				System.out.printf("I=%.1f J=%.1f%n", i, j);
				System.out.printf("I=%.1f J=%.1f%n", i, j+1);
				System.out.printf("I=%.1f J=%.1f%n", i, j+2);
									
			}
			i += 0.2;
			j += 0.2;
			
		}

	}

}
