package URI;

import java.util.Scanner;

public class URI_1305 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String num = sc.next();
			String cutoff = sc.next();
						
			double n = newNum(num, cutoff);
			System.out.printf("%.0f\n", n);			
		}
		
		sc.close();
	}
	
	static double newNum(String num, String cutoff) {
		int indexPointNum = indexOfPoint(num);
		int indexPointCutoff = indexOfPoint(cutoff);		
		double fractionNum = parseDouble(indexPointNum, num);
		double fractionCutoff = parseDouble(indexPointCutoff, cutoff);
						
		if (fractionNum > fractionCutoff) {
			return Math.ceil(Double.parseDouble((num)));
		}
		return Math.floor(Double.parseDouble((num)));
	}
	
	static int indexOfPoint(String str) {
		return str.indexOf(".");
	}
	
	static Double parseDouble(int index, String num) {
		if (index == num.length()-1 || index == -1) {
			return 0.0;
		}
		return Double.parseDouble("0" + num.substring(index));
	}
}