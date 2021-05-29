package URI;

import java.util.Scanner;

public class URI_2162 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[]picosAndVales = new int[n];
		
		for (int i = 0; i < n; i++) {
			picosAndVales[i] = sc.nextInt();
		}
		
		int padrao = 0;
		
		if (picosAndVales[1] < picosAndVales[0]) padrao = isVale(picosAndVales, 2);
		else if (picosAndVales[1] > picosAndVales[0]) padrao = isPico(picosAndVales, 2);		
		
		System.out.println(padrao);
		
		sc.close();
	}
	
	static int isPico(int[] picosAndVales, int pos) {
		if (pos == picosAndVales.length) return 1;
		
		if (picosAndVales[pos] < picosAndVales[pos-1]) return isVale(picosAndVales, pos+1);
		return 0;			
	}
	
	static int isVale(int[] picosAndVales, int pos) {
		if (pos == picosAndVales.length) return 1;
		
		if (picosAndVales[pos] > picosAndVales[pos-1]) return isPico(picosAndVales, pos+1);
		return 0;		
	}
}
