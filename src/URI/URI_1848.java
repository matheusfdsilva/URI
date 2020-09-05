package URI;
import java.util.Scanner;

public class URI_1848 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		int grito = 0;
		int soma = 0;
		String piscada;

		do {			
			piscada = sc.nextLine();
			
			switch(piscada) {
			case "--*":
				soma += 1;
				break;
			case "-*-":
				soma += 2;
				break;
			case "-**":
				soma += 3;
				break;
			case "*--":
				soma += 4;
				break;
			case "*-*":
				soma += 5;
				break;
			case "**-":
				soma += 6;
				break;
			case "***": 
				soma += 7;
				break;
			default:
				System.out.println(soma);
				soma = 0;
				grito++;
			}			
			
		}while (grito < 3);	
		
		sc.close();

	}

}
