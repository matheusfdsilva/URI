package URI;

public class URI_2753 {

	public static void main(String[] args) {
		
		int[] n = new int[26];
		int aux = 97;
		for (int i = 0; i < 26; i++) {
			n[i] = aux;
			aux++;
		}
		char x = 'a';
		for (int i = 0; i < 26; i++) {
			System.out.println(n[i] + " e " + x);
			x++;
		}
	}
}
