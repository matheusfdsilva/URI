package URI;

import java.util.Scanner;

public class URI_2435 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int codx = sc.nextInt();
		int disx = sc.nextInt();
		int kmx = sc.nextInt();
		
		int cody = sc.nextInt();
		int disy = sc.nextInt();
		int kmy = sc.nextInt();
		
		double segx = secondsToFinish(disx, kmx);
		double segy = secondsToFinish(disy, kmy);
		
		System.out.println(segx < segy ? codx : cody);		
		
		sc.close();		

	}

	private static double secondsToFinish(int dis, int km) {
		return dis / (km / 3.6);
	}
}
