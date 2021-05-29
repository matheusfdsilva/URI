package URI;
import java.util.Scanner;

public class URI_2165 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String txt = sc.nextLine();
		
		if (txt.length() <= 140) {
			System.out.println("TWEET");
		} else {
			System.out.println("MUTE");
		}		
		
		sc.close();
	}

}
