package URI;

import java.util.Scanner;

public class URI_2582 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[]soadSongs = new String[] {"PROXYCITY","P.Y.N.G.","DNSUEY!","SERVERS","HOST!","CRIPTONIZE",
										"OFFLINE DAY","SALT","ANSWER!","RAR?","WIFI ANTENNAS"};
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			
			int x = sc.nextInt();
			int y = sc.nextInt();
			System.out.println(soadSongs[x + y]);
		}
		
		sc.close();

	}

}
