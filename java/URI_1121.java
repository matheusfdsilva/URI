package URI;

import java.util.Scanner;

public class URI_1121 {

	private static final String FULL_DIRECTION = "ONLS";
	private static Character ROBOT_DIRECTION = null;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int s = sc.nextInt();		
		
		while (n != 0 || m != 0 || s != 0) {	
			sc.nextLine();
			String[][] fields = new String[n][m];
			int[] posStart = new int[2];
			
			for (int i = 0; i < n; i++) {
				String string = sc.nextLine();					
				if (posStart[0] == 0) {
					for (int k = 0; k < string.length(); k++) {
						if (FULL_DIRECTION.contains(string.charAt(k)+"")) {
							posStart[0] = i;
							posStart[1] = k;							
							ROBOT_DIRECTION = string.charAt(k);
						}
					}
				}
				fields[i] = string.split("");					
			}						
			
			int figures = 0;			
			int rowRobot = posStart[0];
			int columnRobot = posStart[1];			
			String moviments = sc.nextLine();
			
			for (int i = 0; i < s; i++) {
				char robotMoviment = moviments.charAt(i);
				if (robotMoviment != 'F') { 
					int dif;
					if (robotMoviment == 'D') {
						dif = FULL_DIRECTION.indexOf(ROBOT_DIRECTION) + 1;
						if (dif == FULL_DIRECTION.length()) {
							dif = 0;
						}						
					} 
					else {    
						dif = FULL_DIRECTION.indexOf(ROBOT_DIRECTION) - 1;
						if (dif == -1) {
							dif = 3;
						}							
					}
					ROBOT_DIRECTION = FULL_DIRECTION.charAt(dif);
				}

				else {
					switch (ROBOT_DIRECTION) {
					case 'N':
						if (rowRobot - 1 >= 0) {
							String piece = fields[rowRobot - 1][columnRobot];
							if (!piece.equals("#")) {
								if (piece.equals("*")) {
									figures++;
									fields[rowRobot - 1][columnRobot] = ".";
								}
								rowRobot--;
							}
						}
						break;

					case 'S':
						if (rowRobot + 1 < n) {
							String piece = fields[rowRobot + 1][columnRobot];
							if (!piece.equals("#")) {
								if (piece.equals("*")) {
									figures++;
									fields[rowRobot + 1][columnRobot] = ".";
								}
								rowRobot++;
							}
						}
						break;

					case 'L':
						if (columnRobot + 1 < m) {
							String piece = fields[rowRobot][columnRobot + 1];
							if (!piece.equals("#")) {
								if (piece.equals("*")) {
									figures++;
									fields[rowRobot][columnRobot + 1] = ".";
								}
								columnRobot++;
							}
						}
						break;

					case 'O':
						if (columnRobot - 1 >= 0) {
							String piece = fields[rowRobot][columnRobot - 1];
							if (!piece.equals("#")) {
								if (piece.equals("*")) {
									figures++;
									fields[rowRobot][columnRobot - 1] = ".";
								}
								columnRobot--;
							}
						}
						break;
					default:
						break;
					}
				}
			}

			System.out.println(figures);
			n = sc.nextInt();
			m = sc.nextInt();
			s = sc.nextInt();
		}

		sc.close();
	}
}