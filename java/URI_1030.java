package URI;

import java.util.Scanner;

public class URI_1030 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			Integer[]peoples = createGroup(x);				
			Integer surviver = lastSurviver(peoples, y);
			System.out.println("Case " + i + ": " + surviver);			
			
		}
		
		sc.close();
	}
	static Integer[] createGroup(int x) {
		Integer[] group = new Integer[x];
		
		for (int z = 1; z <= x; z++) {
			group[z-1] = z;
		}
		return group;
	}
	
	static Integer lastSurviver(Integer[] peoples, int range) {
		int countDeaths = 0;
		int countRange = 0;
		
		if (peoples.length > 1) {
			for (int a = 0; a < peoples.length; a++) {
				
				if (peoples[a] != null) {
					countRange++;
					if (countRange == range) {						
						peoples[a] = null;
						countRange = 0;
						countDeaths++;						
					}									
				}
				// caso tenha restado apenas 1 vivo
				if (countDeaths == peoples.length - 1) break;
				
				// necessario para recomeçar o looping
				if (a == peoples.length - 1) a = - 1;				
			}	
		}
		return numberLastSurviver(peoples);
	}
	
	static Integer numberLastSurviver(Integer[] peoples) {
		Integer numberSurviver = 0;
		
		for (Integer surviver : peoples) {
			if (surviver != null) {
				numberSurviver = surviver;
			}
		}		
		return numberSurviver;
	}
}
