package URI;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class URI_2663 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			int n = sc.nextInt();
			Map<Integer, String> map = new TreeMap<>();
			for (int i = 0; i < n; i++) {
				String meet = sc.next();
				int vality = sc.nextInt();
				map.put(vality, meet);
			}
			
			int temp = 0;
			for (Integer key : map.keySet()) {
				if (temp == map.size() - 1){
					System.out.println(map.get(key));
				}
				else {
					System.out.print(map.get(key) + " ");
				}
				temp++;
			}
		}
		
		sc.close();

	}
}