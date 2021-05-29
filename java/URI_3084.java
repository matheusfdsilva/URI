package URI;

import java.util.Scanner;

public class URI_3084 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			int h = sc.nextInt();
			int m = sc.nextInt();		
			
			System.out.println(correctHour(h, m));			
		}
		
		sc.close();
	}

	static String correctHour(int h, int m) {
		int realHour = h / 30;
		int realMinutes = m / 6;
		String hours = "";
		
		if (realHour < 10) hours += "0" + realHour;			
		else hours += realHour;
		
		hours += ":";
		
		if (realMinutes < 10) hours += "0" + realMinutes;
		else hours += realMinutes;
		
		return hours;
	}

}
