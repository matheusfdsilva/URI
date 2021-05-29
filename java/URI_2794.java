package URI;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class URI_2794 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Map<Integer, Integer> map = new TreeMap<>();	
		int dis, ton;
				
		for (int i = 0; i < n; i++) {
			dis = sc.nextInt();
			ton = sc.nextInt();
			map.put(dis, ton);
		}
						
		System.out.println(checkPadrao(map) ? "S" : "N") ;	
		
		sc.close();
	}
	
	private static boolean checkPadrao(Map<Integer, Integer> map) {
		int i = 0, dist = 0;		
		for (Integer key : map.keySet()) {
			if (i == 0) dist = map.get(key);
			
			else if (map.get(key) > dist) {
				return false;
			}
			else{
				dist = map.get(key);
			}			
			i++;
		}
		return true;
	}
}