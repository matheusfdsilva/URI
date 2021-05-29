package URI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class URI_2087 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String str;
		List<String>list = new ArrayList<>();
		
		while (n != 0) {
			boolean isGood = true;
			for (int i = 0; i < n; i++) {
				str = sc.next();
				list.add(str);
				
				if (i > 0 && isGood) {
					for (int k = 0; k < list.size() - 1; k++) {										
						if (str.startsWith(list.get(k)) || list.get(k).startsWith(str)){
							isGood = false;
							break;
						}							
					}
				}
			}
			System.out.println(isGood ? "Conjunto Bom" : "Conjunto Ruim");
			list.clear();
			n = sc.nextInt();			
		}		
		
		sc.close();
	}
}