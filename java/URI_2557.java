package URI;

import java.util.Scanner;

public class URI_2557 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String[]line = sc.next().replace("+", "=").split("=");		
			Integer[]fields = new Integer[line.length];
			
			for (int i = 0; i < line.length; i++) {
				if (!line[i].equals("R")  && !line[i].equals("J") && !line[i].equals("L")) {
					fields[i] = Integer.parseInt(line[i]);
				}
				else fields[i] = null;
			}
					
			
			System.out.println(calculateResult(fields));		
		}
		
		sc.close();				
	}
	
	static int calculateResult(Integer[] res) {
		int result;
		if (res[0] == null) {
			result = res[2] - res[1];
		}
		else if (res[1] == null) {
			result = res[2] - res[0];
		}
		else {
			result = res[0] + res[1];			
		}
		return result;
	}	
}
