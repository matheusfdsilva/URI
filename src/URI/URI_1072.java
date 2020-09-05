package URI;
import java.util.Scanner;

public class URI_1072 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int i = 0;
		int dentro = 0;
		int fora = 0;
		
		while(i < n) {
			int num = sc.nextInt();
			if(num < 10 || num > 20) {
				fora += 1;
			}
			else {
				dentro += 1;
			}
			i++;
		}
		
		System.out.println(dentro + " in");
		System.out.println(fora + " out");		
		
		sc.close();		

	}

}
