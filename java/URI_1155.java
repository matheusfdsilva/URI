package URI;
import java.util.Locale;

public class URI_1155 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		double soma = 0;
		
		for (int i = 1; i <= 100; i++) {
			soma += (double) 1 / i;			
		}
		
		System.out.printf("%.2f\n", soma);

	}

}
