package URI;
import java.util.Scanner;

public class URI_1175 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int []vectAux = new int[20];
		int []vect = new int[20];
		
		for(int i = 0; i < vectAux.length; i++) {
			int n = sc.nextInt();
			vectAux[i] = n;
		}
		
		for(int i = 0; i < vectAux.length; i++) {	
			vect[i] = vectAux[19-i]	;	
			System.out.println("N[" + i + "] = " + vect[i]);
		}		
		
		sc.close();

	}

}
