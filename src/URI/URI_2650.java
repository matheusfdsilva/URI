package URI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class URI_2650 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		 int n = sc.nextInt();
		 int h = sc.nextInt();		
		 sc.nextLine();
		 List<String>titas = new ArrayList<>();
		 
		 for (int i = 0; i < n; i++) {
			String str = sc.nextLine();
			
			String number, name;
			int altura;			
			int aux = 0;
			char ch = str.charAt(aux);
			
			while (!Character.isDigit(ch)) {
				 aux++;
				 ch = str.charAt(aux);
			 }
			 			 
			 number = str.substring(aux);
			 name = str.substring(0, aux-1); // -1 para não pegar o ultimo space	
			 altura = Integer.parseInt(number);
			 
			 if (altura > h) {
				 titas.add(name);
			 }			
		 }	
		
		 titas.forEach(System.out::println);		 
		
		sc.close();
	}
}