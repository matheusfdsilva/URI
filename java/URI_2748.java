package URI;

public class URI_2748 {

	public static void main(String[] args) {
		
		for (int x = 1; x <= 7; x++) {
			for (int i = 1; i <= 39; i ++) {
				
				if (x == 1 && i == 39 || x == 7 && i == 39) {
					System.out.println("-");
					
				} else if (x == 1 && i < 39 || x == 7 && i < 39) {
					System.out.print("-");
					
				} else if (x == 2 && i == 10){
					System.out.print("Roberto");
					i += 6;
					
				} else if (x == 4 && i == 10) {
					System.out.print(5786);
					i += 3;
					
				} else if (x == 6 && i == 10) {
					System.out.print("UNIFEI");
					i += 5;
					
				} else if (x > 1 && i == 1 || i == 39) {
					System.out.print("|");
					if (i == 39) {
						System.out.println();						
					}					
				} else {
					System.out.print(" ");
				}			
			}			
		}
	}
}
