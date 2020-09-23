package URI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class URI_2650 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		 int n = sc.nextInt();
		 int h = sc.nextInt();
		 List<String>list = new ArrayList<>();
		 sc.nextLine();
		 
		 for (int i = 0; i < n; i++) {
			 list.add(sc.nextLine());
		 }
		 
		 List<String>titas = new ArrayList<>();
		 String number, name;
		 int altura;
		 
		 for (String str : list) {
			 number = "";
			 name = "";
			 for (int j = 0; j < str.length(); j++) {
				 char ch = str.charAt(j);
				 if (Character.isDigit(ch)) {
					 number += ch;
				 }
				 else {
					 name += ch;
				 }
			 }
			 altura = Integer.parseInt(number);
			 if (altura > h) {
				 titas.add(name.trim());
			 }
		 }
		
		 titas.forEach(System.out::println);		 
		
		sc.close();
	}
}