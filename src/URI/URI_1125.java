package URI;

import java.util.Scanner;

public class URI_1125 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int g = sc.nextInt();
		int p = sc.nextInt();
		
		while (g != 0 && p != 0) {
			int[][]result = new int[g][p];
			for (int i = 0; i < result.length; i++) {
				for (int j = 0; j < result[i].length; j++) {
					result[i][j] = sc.nextInt();
				}
			}
			
			int n = sc.nextInt();			
			for (int i = 0; i < n; i++) {
				int pos = sc.nextInt();
				int[]points = new int[pos];
				for (int k = 0; k < pos; k++) {
					points[k] = sc.nextInt();
				}
				int[][] pointsPerPosition = calculePoints(result, points, g , p);
				int maxPoint = maxPoint(pointsPerPosition, p);
				String champions = checkNumbersChampions(maxPoint, pointsPerPosition, p);
				System.out.println(champions);				
			}				
			
			g = sc.nextInt();
			p = sc.nextInt();			
		}
				
		sc.close();
	}

	private static String checkNumbersChampions(int maxPoint, int[][] result, int column) {
		String champions = "";
		for (int k = 0; k < column; k++) {
			int sum = 0;
			for (int i = 0; i < result.length; i++) {
				sum += result[i][k];
			}
			if (sum == maxPoint) {
				champions += (k + 1) + " ";
			}
		}
		return champions.trim();
	}

	private static int maxPoint(int[][] result, int column) {
		int max = 0;
		for (int i = 0; i < column; i++) {
			int sum = 0;
			for (int j = 0; j < result.length; j++) {
				sum += result[j][i];
			}
			if (sum > max) {
				max = sum;
			}
		}		
		return max;
	}

	private static int[][] calculePoints(int[][] result, int[] points, int row, int column) {
		int[][] fullPoints = new int[row][column];
		for (int i = 0; i < points.length; i++) {
			for (int j = 0; j < result.length; j++) {
				for (int k = 0; k < result[j].length; k++) {
					if (result[j][k]-1 == i) {
						fullPoints[j][k] = points[i];						
					}
				}
								
			}
		}
		return fullPoints;
	}
}