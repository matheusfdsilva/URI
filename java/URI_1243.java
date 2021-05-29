package URI;

import java.util.Scanner;

public class URI_1243 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			int words = 0, sum = 0;
			String[] fields = sc.nextLine().trim().split(" ");
			
			for (int i = 0; i < fields.length; i++) {
				int countDigits = 0, countPoints = 0;				
				for (char ch : fields[i].toCharArray()) {
					if (Character.isDigit(ch)) {
						countDigits++;
					}
					if (ch == '.') {
						countPoints++;
					}
				}
				
				int aux = fields[i].length();
				if (countDigits == 0 && (countPoints == 0 || countPoints == 1 && aux > 1 && fields[i].lastIndexOf(".") == aux -1)) {					
					sum += aux - countPoints;					
					words++;
				}				
			}
			
			int avg = words == 0 ? 0 : sum / words;
			if (avg >= 6) {
				System.out.println(1000);
			}
			else {
				System.out.println(avg <= 3 ? 250 : 500);
			}
		}		
		
		sc.close();
	}
}