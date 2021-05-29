package URI;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class URI_1136 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int b = sc.nextInt();
		
		while (n != 0 && b != 0) {
		 
			int[] numbers = new int[b];
			for (int i = 0; i < b; i++) {
				numbers[i] = sc.nextInt();
			}
			
			Set<Integer> set = new HashSet<>();
			for (int i = 0; i < numbers.length; i++	) {
				for (int j = i+1; j < numbers.length; j++) {
					int numRaffled = Math.abs(numbers[i] - numbers[j]);
					set.add(numRaffled);
				}
			}
			
			int sumBallsGloub = set.stream().reduce(0, (x, y) -> x + y);
			int sumRight = calculeSum(n);
			
			System.out.println(sumRight == sumBallsGloub ? "Y" : "N");
			
			n = sc.nextInt();
			b = sc.nextInt();
			
		}
		
		sc.close();

	}

	private static int calculeSum(int n) {
		int sum = n;
		for (int i = n-1; i > 0; i--) {
			sum += i;
		}
		return sum;
	}
}
