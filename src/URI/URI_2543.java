package URI;
import java.util.Scanner;

public class URI_2543 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			
			int n = sc.nextInt();
			int identificador = sc.nextInt();
			int publicados = 0;
			
			for (int i = 0; i < n; i++) {
				int identificadorAutor = sc.nextInt();
				int gamePlay = sc.nextInt();
				
				if (identificadorAutor == identificador && gamePlay == 0) {
					publicados++;
				}
			}
			System.out.println(publicados);
		}		
		
		sc.close();
	}

}
