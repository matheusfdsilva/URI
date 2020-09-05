package URI;
import java.util.Scanner;

public class URI_1541 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, areaConstruida, areaTerreno, medidaLado;				
		
		do {
			a = sc.nextInt();
			if(a == 0) {
				break;
			}
			else {
				b = sc.nextInt();
				if(b == 0) {
					break;
				}
				else {
					c = sc.nextInt();
					if(c == 0) {
						break;
					}
				}
			}				
			
			areaConstruida = a * b;
			areaTerreno = areaConstruida * 100 / c;
			medidaLado = (int) Math.sqrt(areaTerreno);
			System.out.println(medidaLado);						
		} while(a != 0 || b != 0 || c != 0);			
		
		sc.close();
	}
}
