package URI;
import java.util.Scanner;

public class URI_2160 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String txt = sc.nextLine();
		
		if(txt.length() <= 80) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}		
		
		sc.close();
	}

}
