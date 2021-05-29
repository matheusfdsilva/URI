package URI;

public class URI_2749 {

	public static void main(String[] args) {
	
		for (int x = 1; x <= 7; x++) {
			for (int i = 1; i <= 39; i ++) {
				if (x == 1 && i == 39 || x == 7 && i == 39) {
					System.out.println("-");
					
				} else if (x == 1 && i < 39 || x == 7 && i < 39) {
					System.out.print("-");
					
				} else if (x > 1 && i == 1 || i == 39) {					
					System.out.print("|");	
					if (i == 39) {
						System.out.println();
					}				
				} else if (x == 2 && i == 2 || x == 4 && i == 17 || x == 6 && i == 33) {
					System.out.print("x = 35");
					i += 5;
					
				} else {
					System.out.print(" ");
				}			
			}			
		}	
	}
}
