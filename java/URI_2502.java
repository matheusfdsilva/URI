package URI;

import java.util.Scanner;

public class URI_2502 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			sc.nextInt();
			int y = sc.nextInt();
			sc.nextLine();
			String a = sc.nextLine().toLowerCase();
			String b = sc.nextLine().toLowerCase();						
						
			for (int i = 0; i < y; i++) {
				StringBuilder decodificada = new StringBuilder();
				int index;								
				String criptografada = sc.nextLine();
				
				for (char ch : criptografada.toCharArray()) {
					char temp = Character.toLowerCase(ch);					
					if (a.contains(temp+"")) {
						index = a.indexOf(temp);
						if (Character.isUpperCase(ch)) decodificada.append(Character.toUpperCase(b.charAt(index)));						
						else decodificada.append(b.charAt(index));
					}
					else if (b.contains(temp+"")) {
						index = b.indexOf(temp);
						if (Character.isUpperCase(ch)) decodificada.append(Character.toUpperCase(a.charAt(index)));
						else decodificada.append(a.charAt(index));
					}
					else decodificada.append(ch);					
				}
				
				System.out.println(decodificada.toString());				
			}
			System.out.println();
		}		
		
		sc.close();
	}
}