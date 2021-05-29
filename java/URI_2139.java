package URI;

import java.util.Scanner;

public class URI_2139 {
	
	public static final int[] DAYS = new int[] {0,31,60,91,121,152,182,213,244,274,305,335,366};
	public static final int[] MONTHDAYS = new int[] {0,31,29,31,30,31,30,31,31,30,31,30,31};
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			int month = sc.nextInt();
			int day = sc.nextInt();
						
			int days = DAYS[month] - (MONTHDAYS[month] - day);			
			
			if (days < 359) {
				int leftDays = 360 - days;			
				System.out.println("Faltam " + leftDays + " dias para o natal!");
			}
			else if (days == 359) {
				System.out.println("E vespera de natal!");
			}
			else if (days == 360) {
				System.out.println("E natal!");
			}
			else  {
				System.out.println("Ja passou!");
			}
		}		
		
		sc.close();
	}
}