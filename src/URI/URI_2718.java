package URI;

import java.util.Scanner;

public class URI_2718 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		long num;
		
		for (int i = 0; i < n; i++) {
			 num = sc.nextLong();
			String binary = Long.toBinaryString(num);			
			String[]fields = binary.split("0");
			int maxSeq = 0;
			for (String str : fields) {				
				if (str.length() > maxSeq) {
					maxSeq = str.length();
				}
			}			
			System.out.println(maxSeq);			
		}	
		
		sc.close();
	}
}