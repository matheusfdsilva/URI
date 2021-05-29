package URI;
import java.util.Scanner;

public class URI_1847 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if (b < a) {
			if(c == b || c > b) { 
				System.out.println(":)");
			}else if(b - c < a - b) {
				System.out.println(":)");
			}else {
				System.out.println(":(");
			}
		}else if(a == b) {
			if(c > b) {
				System.out.println(":)");
			}else {
				System.out.println(":(");
			}
		}else {
			if(c <= b) {
				System.out.println(":(");
			}else if(c > b) {
				if(c - b < b - a) {
					System.out.println(":(");
				}else {
					System.out.println(":)");
				}
			}
		}		
		
		
		sc.close();
	
	}

}
