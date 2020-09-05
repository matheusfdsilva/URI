package URI;
import java.util.Locale;

public class URI_1156 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		double soma = 0.0;
		double aux = 1.0;
		
		for(double i = 1.0; i <= 39.0; i += 2.0) {			
			soma += i / aux;			
			aux *= 2;			
		}
		
		System.out.printf("%.2f\n", soma);

	}

}
