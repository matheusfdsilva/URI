package URI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class URI_1147 {
	private static List<Integer> horseMoves = new ArrayList<>();
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int test = 1;
		String horse = sc.next();
		
		while (!horse.equals("0")) {
			int[][] chess = new int[8][8];			
			makeHorsePositions(chess, horse);		
			for (int i = 0; i < 8; i++) {
				String pawn = sc.next();
				Integer row = 8 - Integer.parseInt(pawn.charAt(0)+"");
				Integer column = pawn.charAt(1) - 'a';					
				chess[row][column] = 2;		// pra identificar onde estão os peões						
			}
			
			int possibleScapes = 0;
			for (int i = 0; i < horseMoves.size(); i+=2) {
				int row = horseMoves.get(i);
				int column = horseMoves.get(i+1);					
				if (chechRight(chess, row, column) && checkLeft(chess, row, column)) {
					possibleScapes++;
				}
			}						
			
			System.out.println("Caso de Teste #" + test + ": " + possibleScapes + " movimento(s).");			
						
			horse = sc.next();
			test++;
			horseMoves.clear();
		}		
		
		sc.close();
	}

	private static boolean chechRight(int[][] chess, Integer row, Integer column) {
		if (row - 1 < 0 || column + 1 > 7) {			
			return true;
		}
		return chess[row-1][column+1] != 2;
	}

	private static boolean checkLeft(int[][] chess, Integer row, Integer column) {
		if (row - 1 < 0|| column - 1 < 0) {			
			return true;
		}
		return chess[row-1][column-1] != 2;	
	}

	private static void makeHorsePositions(int[][] chess, String horse) {
		Integer row = 8 - Integer.parseInt(horse.charAt(0)+"");
		Integer column = horse.charAt(1) - 'a';				
		if (row + 2 <= 7 && column -1 >= 0) {			
			horseMoves.addAll(Arrays.asList(row + 2, column-1));
		}
		if (row + 1 <= 7 && column -2 >= 0) {			
			horseMoves.addAll(Arrays.asList(row + 1, column-2));
		}
		if (row + 2 <= 7 && column +1 <= 7) {			
			horseMoves.addAll(Arrays.asList(row + 2, column+1));
		}
		if (row + 1 <= 7 && column +2 <= 7) {			
			horseMoves.addAll(Arrays.asList(row + 1, column+2));
		}
		if (row - 1 >= 0 && column -2 >= 0) {			
			horseMoves.addAll(Arrays.asList(row - 1, column-2));
		}
		if (row - 2 >= 0 && column -1 >= 0) {				
			horseMoves.addAll(Arrays.asList(row - 2, column-1));
		}
		if (row - 2 >= 0 && column +1 <= 7) {			
			horseMoves.addAll(Arrays.asList(row - 2, column+1));
		}
		if (row - 1 >= 0 && column +2 <= 7) {			
			horseMoves.addAll(Arrays.asList(row - 1, column+2));
		}
	}
}