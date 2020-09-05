package URI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class URI_2812 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			int size = sc.nextInt();
			List<Integer> list = new ArrayList<>();
			
			for (int x = 0; x < size; x++) {
				int num = sc.nextInt();
				if (num % 2 != 0) list.add(num);
			}
			
			List<Integer> newList = sortList(list);
						
			String result = "";
			for (Integer obj : newList) {
				result += obj + " ";
			}
			System.out.println(result.trim());
		}		
		
		sc.close();
	}
	static List<Integer> sortList(List<Integer>list){
		List<Integer> sortList = new ArrayList<>();
		while (list.size() > 1) {
			int bigger = 0, small = list.get(0);
			for (int y = 0; y < list.size(); y++) {
				if (list.get(y) > bigger) bigger = list.get(y);					
				if (list.get(y) < small) small = list.get(y);						
			}
			sortList.add(bigger);
			sortList.add(small);
			int indexBig = list.indexOf(bigger);				
			list.remove(indexBig);
			int indexSmall = list.indexOf(small);
			list.remove(indexSmall);			
		}
		
		if (list.size() == 1) sortList.add(list.get(0));
		return sortList;
	}
}