package URI;
import java.util.Scanner;

public class URI_1131 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int vitInter = 0; int vitGre = 0; int empates = 0;
		int resp;		
		
		do {
			int golsInter = sc.nextInt();
			int golsGre = sc.nextInt();		
			
			if(golsInter > golsGre) {
				vitInter += 1;				
			}
			else if(golsInter < golsGre) {
				vitGre += 1;
			}
			else {
				empates += 1;
			}
			System.out.println("Novo grenal (1-sim 2-nao)");
			resp = sc.nextInt();			
		}while(resp == 1);
		
		int grenais = vitInter + vitGre + empates;
		System.out.println(grenais + " grenais");
		System.out.println("Inter:" + vitInter);
		System.out.println("Gremio:" + vitGre);
		System.out.println("Empates:" + empates);
		if(vitInter > vitGre) {
			System.out.println("Inter venceu mais");
		}
		else if(vitGre > vitInter){
			System.out.println("Gremio venceu mais");
		}
		else {
			System.out.println("Empate");
		}						
		
		sc.close();
		

	}

}
