package URI;

import java.util.Scanner;

public class URI_2592 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		while (n != 0) {
			int[] numbers = new int[n];
			int count = 0;			
			boolean sorted = false;
			
			while (!sorted) {
				count++;				
				numbers = insert(numbers, sc);
				sorted = isSorted(numbers);
			}
			
			System.out.println(count);
			n = sc.nextInt();
		}
		
		sc.close();
	}
	
	private static int[] insert(int[] numbers, Scanner sc) {
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = sc.nextInt();
		}
		return numbers;
	}

	private static boolean isSorted(int[] numbers) {
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] < numbers[i-1]) {
				return false;
			}
		}
		return true;
	}
}
