package URI;
import java.util.Scanner;

public class URI_1564 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		  while (sc.hasNext()) {
	            int num = sc.nextInt();

	            if (num == 0) {
	                System.out.println("vai ter copa!");
	            } else {
	                System.out.println("vai ter duas!");
	            }	            	
		  }

	
		sc.close();
	}

}
