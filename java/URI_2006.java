package URI;
import java.util.Scanner;

public class URI_2006 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int type = sc.nextInt();
		int acertos = 0;
		
		for (int i=0; i<5; i++) {
			int respCompetidor = sc.nextInt();
			if (respCompetidor == type) {
				acertos++;
			}
		}
		
		System.out.println(acertos);
		
		sc.close();
	}

}
