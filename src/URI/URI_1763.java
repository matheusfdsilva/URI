package URI;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class URI_1763 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Map<String, String> map = new HashMap<>();
		map.put("brasil", "Feliz Natal!");
		map.put("alemanha", "Frohliche Weihnachten!");
		map.put("austria", "Frohe Weihnacht!");
		map.put("coreia", "Chuk Sung Tan!");
		map.put("espanha", "Feliz Navidad!");
		map.put("grecia", "Kala Christougena!");
		map.put("estados-unidos", "Merry Christmas!");
		map.put("inglaterra", "Merry Christmas!");
		map.put("australia", "Merry Christmas!");
		map.put("portugal", "Feliz Natal!");
		map.put("suecia", "God Jul!");
		map.put("turquia", "Mutlu Noeller");
		map.put("argentina", "Feliz Navidad!");
		map.put("chile", "Feliz Navidad!");
		map.put("mexico", "Feliz Navidad!");
		map.put("antardida", "Merry Christmas!");
		map.put("canada", "Merry Christmas!");
		map.put("irlanda", "Nollaig Shona Dhuit!");
		map.put("belgica", "Zalig Kerstfeest!");
		map.put("italia", "Buon Natale!");
		map.put("libia", "Buon Natale!");
		map.put("siria", "Milad Mubarak!");
		map.put("marrocos", "Milad Mubarak!");
		map.put("japao", "Merii Kurisumasu!");	
		
		while (sc.hasNext()) {
			String country = sc.nextLine();
			if (map.containsKey(country)) System.out.println(map.get(country));
			else System.out.println("--- NOT FOUND ---");
		}
				
		sc.close();
	}
}