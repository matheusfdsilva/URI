package URI;

import java.util.Scanner;

public class URI_2591 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			String hamekame = sc.next();
			
			int indexK = hamekame.indexOf("k");
			String a = hamekame.substring(0, indexK);
			String b = hamekame.substring(indexK);
			
			int aBefore = countA(a);
			int aAfter = countA(b);
			
			String kaaaaa = "k";
			for (int j = 0; j < aBefore * aAfter; j++) {
				kaaaaa += "a";
			}
			System.out.println(kaaaaa);
		}
		
		sc.close();
	}
	
	static int countA(String str) {
		int count = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a') {
				count++;
			}
		}
		return count;
	}
}	