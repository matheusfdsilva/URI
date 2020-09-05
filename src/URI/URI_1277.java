package URI;

import java.util.Scanner;

public class URI_1277 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {			
			sc.nextInt();
			sc.nextLine();
			String[]names = sc.nextLine().split(" ");
			String[] situacion = sc.nextLine().split(" ");			
			
			String nameStudentsNoMinFreq = "";
			for (int x = 0; x < situacion.length; x++) {
				double frequency = 0.0;
				double countP = 0.0;
				double countA = 0.0;
				
				for (char ch : situacion[x].toCharArray()) {
					if (ch == 'P') countP++;
					else if (ch == 'A') countA++;					
				}				
				
				frequency = countP * 100 / (countP + countA);					
				if (frequency < 75.0) nameStudentsNoMinFreq += names[x] + " ";
				
			}
			System.out.println(nameStudentsNoMinFreq.trim());
		}					
				
		sc.close();
	}
}
