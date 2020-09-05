package URI;

import java.util.Scanner;

public class URI_2764 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String data = sc.next();
		System.out.println(data.substring(3, 6)+ data.substring(0, 3) + data.substring(6));
		System.out.println(data.substring(6, 8)+ data.substring(2, 6) + data.substring(0, 2));
		System.out.println(data.substring(0, 2) + "-" + data.substring(3, 5) + "-" + data.substring(6));
		
		sc.close();
	}
}
