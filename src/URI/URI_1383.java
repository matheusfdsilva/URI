package URI;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class URI_1383 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			
			int[][] sudoku = new int[9][9];
			for (int l = 0; l < 9; l++) {
				for (int c = 0; c < 9; c++) {
					sudoku[l][c] = sc.nextInt();
				}
			}
			
			boolean correct = check3x3(sudoku);			
			
			System.out.println("Instancia " + i);
			if (correct) System.out.println("SIM");
			else System.out.println("NAO");
			System.out.println();
		}		
		
		sc.close();
	}

	static boolean check3x3(int[][] sudoku) {
		Set<Integer> set = null;
		
		int column = 3;
		int row = 3;
		int auxRow = 0, auxColumn = 0;
		
		while (row < 9) {	
			set = new HashSet<>();
			for (int i = auxRow; i < row; i++) {
				for (int j = auxColumn; j < column; j++) {
					if (set.contains(sudoku[i][j]))	{
						return false;						
					}
					set.add(sudoku[i][j]);					
				}			
			}			
			auxColumn += 3;
			column += 3;
			if (column > 9) column = 9;
			
			if (auxColumn >= 9) {
				
				auxRow += 3;
				row += 3;
				auxColumn = 0;
				column = 3;
			}
		}
		return checkRow(sudoku, set);		
	}
			
	static boolean checkRow(int[][] sudoku, Set<Integer> set) {
		set.clear();
		int column = 0;
		int row = 0;
				
		while (row < 9) {
			if (set.contains(sudoku[row][column])) {
				return false;
			}
			set.add(sudoku[row][column]);
			
			column++;
			if (column == 9) {
				set.clear();
				row++;
				column = 0;
			}		
		}
		return checkColumn(sudoku, set);		
	}
	
	static boolean checkColumn(int[][] sudoku, Set<Integer> set) {
		set.clear();
		int column = 0;
		int row = 0;
				
		while (column < 9) {
			if (set.contains(sudoku[row][column])) {
				return false;
			}			
			set.add(sudoku[row][column]);
			
			row++;
			if (row == 9) {
				set.clear();
				column++;
				row = 0;
			}		
		}
		return true;
	}
}