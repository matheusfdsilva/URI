package URI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class URI_2958 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<String> life = new ArrayList<>();
		List<String> discipline = new ArrayList<>();
		
		int n = sc.nextInt();
		sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < n; i++) {
			String[]fields = sc.nextLine().split(" ");
			for (int k = 0; k < fields.length; k++) {
				if (fields[k].charAt(1) == 'V') {
					life.add(fields[k]);
				}
				else {
					discipline.add(fields[k]);
				}
			}
		}
				
		sortList(life);
		sortList(discipline);
		makeRelatory(life);		
		makeRelatory(discipline);		
		
		sc.close();
	}
	
	static void sortList(List<String> list) {
		for (int i = 0; i < list.size(); i++) {
			for (int j = 1; j < list.size(); j++) {		
				int temp1 = Integer.parseInt(list.get(j).charAt(0)+"");
				int temp2 = Integer.parseInt(list.get(j-1).charAt(0)+"");				
				if (temp1 > temp2) {
					String aux = list.get(j-1);
					list.remove(j-1);
					list.add(aux);					
				}				
			}
		}		
	}
	
	static void makeRelatory(List<String> list) {		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));	
		}		
	}	
}