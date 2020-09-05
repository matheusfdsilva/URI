package URI;

import java.util.Scanner;

public class URI_1212 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String x = sc.next();
		String y = sc.next();
		
		while (!x.equals("0") || !y.equals("0")) {
			int carryOp;			
			String[] x2 = x.split("");
			String[] y2 = y.split("");
			
			int[] number1 = createVect(x2);
			int[] number2 = createVect(y2);
			
			if (number1.length < number2.length) {
				carryOp = countCarryOperation(number1, number2);
			}
			else {
				carryOp = countCarryOperation(number2, number1);
			}
			
			System.out.println(howMuchCarrys(carryOp));
			
			x = sc.next();
			y = sc.next();
		}
		
		sc.close();

	}
	static int[] createVect(String[] obj) {
		int[] number = new int[obj.length];
		for (int i = 0; i < obj.length; i++) {
			number[i] = Integer.parseInt(obj[i]);
		}
		return number;
	}
	
	static int countCarryOperation(int[] n1, int[] n2) {
		int carryOp = 0, soma = 0, lengthN2 = n2.length-1;
		for (int i = n1.length-1; i>=0; i--) {
			soma += n1[i] + n2[lengthN2];
			
			if (soma > 9) {
				soma = 1;
				carryOp++;
			}
			else soma = 0;
			lengthN2--;
		}		
		
		int aux = n2.length - n1.length -1;
		for (int i = aux; i >= 0; i--) {
			n2[i] += soma;
			if (n2[i] > 9) {
				carryOp++;
				soma = 1;
			}
			else {
				soma = 0;
			}
		}	
		
		return carryOp;
	}
	
	static String howMuchCarrys(int carryOp) {	
		String status = null;
		if (carryOp == 0) status = "No carry operation.";
		else {
			if (carryOp > 1) status = carryOp + " carry operations.";
			else status = carryOp + " carry operation.";
		}
		return status;
	}
}
