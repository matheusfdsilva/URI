package URI;

import java.util.Scanner;

public class URI_2808 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String chess = sc.nextLine();
		
		int rowStart = Integer.parseInt(chess.charAt(1)+"");
		char columnStart = chess.charAt(0);
		int rowDestiny = Integer.parseInt(chess.charAt(4)+"");
		char columnDestiny = chess.charAt(3);				
		
		if (possibleMove(rowStart, columnStart, rowDestiny, columnDestiny)) System.out.println("VALIDO");
		else System.out.println("INVALIDO");			
		
		sc.close();

	}
	static boolean possibleMove(int rowStart, char columnStart, int rowDestiny, char columnDestiny) {
		int resultColumn =  columnDestiny - columnStart;
		int resultRow = rowDestiny - rowStart;
		
		if (resultColumn == -1 && resultRow == 2 || resultColumn == -2 && resultRow == 1 || resultColumn == -1 && resultRow == -2
				|| resultColumn == -2 && resultRow == -1 || resultColumn == 1 && resultRow == -2 || resultColumn == 2 && resultRow == -1
				|| resultColumn == 2 && resultRow == 1 || resultColumn == 1 && resultRow == 2) {
			return true;	
		}
		return false;
	}
}
