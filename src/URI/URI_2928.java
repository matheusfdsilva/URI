package URI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class URI_2928 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		List<String> road = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			road.add(sc.next());
		}

		int jumps = checkJumps(road);
		System.out.println(jumps == 0 ? "N" : jumps);
		
		sc.close();
	}

	static int checkJumps(List<String>road) {
		int jumps = 0, countJumps = 0;
		boolean check = false;
		
		for(String str : road) {
			if (str.contains(".") && check) {
				countJumps++;
			}
			else if (str.contains(".")) {
				check = true;
				countJumps++;
			}
			else {
				check = false;
				if (countJumps > 2) return jumps = 0;
				if (countJumps > 0) {
					jumps++;
					countJumps = 0;
				}
			}
		}
		if (countJumps == 1 || countJumps == 2) jumps++;
		return jumps;
	}
}
