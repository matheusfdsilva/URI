package URI;

import java.util.Scanner;

public class URI_3106 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int totAlunos = 0;
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			int alunos = sc.nextInt();
			totAlunos += alunos - alunos % 3;
		}
		
		System.out.println(totAlunos);		
		
		sc.close();
	}
}