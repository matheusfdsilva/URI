package URI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class URI_1245 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			int n = sc.nextInt();
				
			int pares = 0;
			List<Integer> shoes = new ArrayList<>();
			List<String> sides = new ArrayList<>();
			
			for (int i = 0; i < n; i++) {
				int m = sc.nextInt();
				String l = sc.next();					
				
				shoes.add(m);
				sides.add(l);				
				
				for (int y = 0; y < shoes.size(); y++) {
					if (shoes.get(y) == m && !sides.get(y).equals(l)) {						
						shoes.remove(y);
						sides.remove(y);
						int indexShoes = shoes.lastIndexOf(m);
						shoes.remove(indexShoes);
						int indexSides = sides.lastIndexOf(l);
						sides.remove(indexSides);
						pares++;
						break;									
					}					
				}				
			}			
			
			System.out.println(pares);		
		}
		
		sc.close();
	}
}
