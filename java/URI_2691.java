package URI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class URI_2691 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			String[] numbers = sc.next().split("x");
			int number1 = Integer.parseInt(numbers[0]);
			int number2 = Integer.parseInt(numbers[1]);
			
			List<String> table = createTable(number1, number2);
			
			for (String st : table) {
				System.out.println(st);
			}			
		}
		
		sc.close();

	}
	static List<String> createTable(int number1, int number2){
		List<String> list = new ArrayList<>();			
		String aux = "";
		
		for (int j = 5; j <= 10; j++) {
			aux = number1 + " x " + j + " = " + number1 * j;
			
			if (number1 != number2) {
				aux += " && " + number2 + " x " + j + " = " + number2 * j;
			}
			list.add(aux);
		}
	
		return list;		
	}
}
