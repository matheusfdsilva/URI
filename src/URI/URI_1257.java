package URI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class URI_1257 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			int n = sc.nextInt();
			
			for (int i = 0; i < n; i++) {
				int m = sc.nextInt();
				List<String> strings = new ArrayList<>();
				
				for (int x = 0; x < m; x++) {
					strings.add(sc.next());
				}
				int sum = hashSum(strings);
				System.out.println(sum);
			}
		}
		
		sc.close();
	}

	static int hashSum(List<String> st) {
		int sum = 0;
				
		for (int i = 0; i < st.size(); i++) {
			int pos = 0;
			for (char ch : st.get(i).toCharArray()) {								
				sum += (ch - 'A') + i + pos;
				pos++;				
			}
		}
		
		return sum;
	}
}
