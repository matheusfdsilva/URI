package URI;
import java.util.Scanner;

public class URI_1013 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, maior;		
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		maior = (a + b + Math.abs(a - b)) / 2;
		maior = (c + maior + Math.abs(c - maior)) / 2;
		
		System.out.println(maior + " eh o maior");
		
		sc.close();

	}

}
