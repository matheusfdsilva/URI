package URI;

import java.util.Scanner;

public class URI_2003 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String horario = sc.next();
			int horas = Integer.parseInt(horario.substring(0, 1));
			int minutos = Integer.parseInt(horario.substring(2));		
			
			int atraso;
			
			if (horas == 7) {
				atraso = minutos;				
			} else if (horas == 8) {
				atraso = minutos + 60;
			} else if (horas == 9){
				atraso = minutos + 120;
			} else {
				atraso = 0;
			}
			
			System.out.println("Atraso maximo: " + atraso);	
		}
		
		sc.close();

	}

}
