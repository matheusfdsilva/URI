package URI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class URI_3140 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<String> list = new ArrayList<>();
				
		while (sc.hasNext()) {
			list.add(sc.nextLine());			
		}
		
		int indexOpenBody = 0;
		int indexCloseBody = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).contains("<body>")) indexOpenBody = i + 1;
			if (list.get(i).contains("</body>")) indexCloseBody = i;		
		}
				
		for (int i = indexOpenBody; i < indexCloseBody; i++) {
			System.out.println(list.get(i));
		}		
		
		sc.close();
	}
}