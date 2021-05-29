package URI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class URI_1276 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNextLine()) {
			String str = sc.nextLine();
			if (!str.isEmpty()) {
				List<Character> list = new ArrayList<>();
				for (char ch : str.toCharArray()) {
					if (!list.contains(ch) && !Character.isSpaceChar(ch)) {
						list.add(ch);
					}
				}
				
				quickSort(list, 0, list.size()-1);
				StringBuilder sequency = new StringBuilder();
				String temp = list.get(0)+"";
				
				for (int i = 1; i < list.size(); i++) {
					int dif = list.get(i) - list.get(i-1);				
					if (dif == 1) {
						temp += list.get(i);					
					}
					else {					
						sequency.append(temp.charAt(0)+":"+temp.charAt(temp.length()-1)+", ");
						temp = list.get(i)+"";					
					}
				}				
				sequency.append(temp.charAt(0)+":"+temp.charAt(temp.length()-1)+", ");										
				if (sequency.length() == 5) {
					sequency.delete(3, sequency.length());
				}
				else {
					sequency.delete(sequency.length()-2, sequency.length());
				}	
				System.out.println(sequency.toString());
			}
			else {
				System.out.println();
			}
		}		
		
		sc.close();		
	}

	private static void quickSort(List<Character> list, int left, int right) {
		if (left < right) {
			int p = part(list, left, right);
			quickSort(list, left, p);
			quickSort(list, p+1, right);
		}		
	}

	private static int part(List<Character> list, int left, int right) {
		int middle = (left + right) / 2;
		int pivot = list.get(middle);
		int i = left -1 ;
		int j = right +1;
		while(true) {
			do {
				i++;
			} while (list.get(i).charValue() < pivot);
			do {
				j--;
			} while (list.get(j).charValue() > pivot);
			if (i >= j) {
				return j;
			}
			char aux = list.get(i);
			list.set(i, list.get(j));
			list.set(j, aux);
		}
	}
}
