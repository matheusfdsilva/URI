package URI;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.util.Scanner;

public class URI_1619 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		int n = sc.nextInt();
		LocalTime now = LocalTime.now();		
		
		for (int i = 0; i < n; i++) {			
			LocalDate start = LocalDate.parse(sc.next());			
			LocalDate end = LocalDate.parse(sc.next());				
			Duration duration = Duration.between(LocalDateTime.of(start, now), LocalDateTime.of(end, now));				
			long days = duration.toDays();
			System.out.println(days >= 0L ? days : days * -1);
		}
		
		
		sc.close();
	}
}
