package URI;

public class URI_1097 {

	public static void main(String[] args) {
		
		int i = 1;
		int j = 7;
		
		while(i <= 9) {
			System.out.println("I=" + i + " J=" + j);
			System.out.println("I=" + i + " J=" + (j - 1));
			System.out.println("I=" + i + " J=" + (j - 2));
			i += 2;
			j += 2;
		}

	}

}
