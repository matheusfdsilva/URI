package URI;

import java.util.Scanner;

public class URI_2728 {
	
	public static final String GRACE_HOPPER = "COBOL";
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
				
		while (sc.hasNext()) {
			String[]fields = sc.nextLine().split("-");			
			boolean contains = true;
			
			for (int i = 0; i < fields.length; i++) {	
				char start = fields[i].charAt(0);
				char end = fields[i].charAt(fields[i].length()-1);				
				if (Character.toUpperCase(start) != GRACE_HOPPER.charAt(i) && Character.toUpperCase(end) != GRACE_HOPPER.charAt(i)) {
					contains = false;
				}
			}			
			
			System.out.println(contains ? "GRACE HOPPER" : "BUG");				
		}
		
		sc.close();
	}
}