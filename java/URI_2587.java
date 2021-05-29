package URI;

import java.util.Scanner;

public class URI_2587 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			String a = sc.next();
			String b = sc.next();
			String hide = sc.next();
			
			boolean status = isPossible(a, b , hide);
			System.out.println(status == true ? "Y" : "N");
		}		
		
		sc.close();
	}
	
	static boolean isPossible(String a, String b, String hide) {
		int firstIndex = hide.indexOf("_");
		int lastIndex = hide.lastIndexOf("_");
		
		if (b.contains(a.charAt(firstIndex)+"") && a.charAt(firstIndex) != b.charAt(firstIndex)
			|| b.contains(a.charAt(lastIndex)+"") && a.charAt(lastIndex) != b.charAt(lastIndex)) {		
			return true;
		}
		return false;
	}
}
