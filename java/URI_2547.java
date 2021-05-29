package URI;
import java.util.Scanner;

public class URI_2547 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);				
		
		while (sc.hasNext()) {	
			int visitantes = sc.nextInt();
			int alturaMinima = sc.nextInt();
			int alturaMax = sc.nextInt();
			int n = 0;
			
			for (int i = 0; i < visitantes; i++) {
				int altura = sc.nextInt();
				
				if (altura >= alturaMinima && altura <= alturaMax) {
					n++;
				}
			}
			System.out.println(n);
		}						
		
		sc.close();
	}

}
