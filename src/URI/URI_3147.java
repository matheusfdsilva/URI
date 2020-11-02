package URI;

import java.util.Scanner;

public class URI_3147 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int e = sc.nextInt();
		int a = sc.nextInt();
		int o = sc.nextInt();
		int w = sc.nextInt();		
		int x = sc.nextInt();
		
		int bem = h + e + a + x;
		int mal = o + w;
		
		System.out.println(bem > mal ? "Middle-earth is safe." : "Sauron has returned.");		
		sc.close();
	}
}