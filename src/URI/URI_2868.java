package URI;

import java.util.Scanner;

public class URI_2868 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < n; i++) {
			String[] answer = sc.nextLine().split(" ");
			int number1 = Integer.parseInt(answer[0]);
			int number2 = Integer.parseInt(answer[2]);
			int result = Integer.parseInt(answer[4]);
			String oper = answer[1];
			
			System.out.println(errouu(number1,number2,result,oper));						
		}		
		
		sc.close();

	}

	static String errouu(int number1, int number2, int result, String oper) {
		int sum;
		
		if (oper.equals("+")) sum = number1 + number2;			
		else if (oper.equals("-")) sum = number1 - number2;			
		else sum = number1 * number2;
		
		int countR = Math.abs(result - sum);
		
		String errou = "E";
		
		for (int i = 0; i < countR; i++) {
			errou += "r";
		}
		errou += "ou!";
		
		return errou;
	}
}
