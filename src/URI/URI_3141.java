package URI;

import java.util.Scanner;

public class URI_3141 {
		
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String name = sc.nextLine();
		String today = sc.next();
		String birth = sc.next();
		
		int yearToday = Integer.parseInt(today.substring(6));
		int monthToday = Integer.parseInt(today.substring(3, 5));
		int dayToday = Integer.parseInt(today.substring(0, 2));
		
		int yearBirth = Integer.parseInt(birth.substring(6));
		int monthBirth = Integer.parseInt(birth.substring(3, 5));
		int dayBirth = Integer.parseInt(birth.substring(0, 2));
		
		int age = yearToday - yearBirth;
		
		if (dayBirth == dayToday && monthBirth == monthToday) {
			System.out.println("Feliz aniversario!");
		}
		
		if (monthToday < monthBirth || (monthToday == monthBirth && dayToday < dayBirth)) age--;
		System.out.printf("Voce tem %d anos %s.%n", age, name);
		
		sc.close();

	}
}