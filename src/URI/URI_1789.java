package URI;
import java.util.Scanner;

public class URI_1789 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		while(sc.hasNext()) {
			int n = sc.nextInt();
			int maior = 0, nivel;
			
			for(int i = 0; i < n; i++) {				
				int speed = sc.nextInt();
				
				if (speed < 10) {
					nivel = 1;
				} else if(speed >= 20) {
					nivel = 3;
				} else {
					nivel = 2;
				}
				
				if(nivel > maior) {
					maior = nivel;
				}
			}
			System.out.println(maior);
		}
		
		sc.close();

	}

}
