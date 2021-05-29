package URI;

import java.util.Scanner;

public class URI_2149 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			int n = sc.nextInt();
			long[] fields = new long[n+1];
			fields[0] = 0;
			fields[1] = 1;
			for (int i = 2; i < n; i++) {
				if (i % 2 == 0) {
					fields[i] = fields[i-1] + fields[i-2];
				}
				else {
					fields[i] = fields[i-1] * fields[i-2];
				}
			}
			System.out.println(fields[n-1]);			
		}		
		
		sc.close();
	}
}