package URI;

import java.util.Arrays;
import java.util.Scanner;

public class URI_1303 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int timeA, timeB, cestasA, cestasB, instancia = 1;
		
		while (n != 0) {			
			if (instancia > 1) {
				System.out.println();
			}
			Resultado[] times = new Resultado[n];
			int t = n * (n-1) / 2;
			for (int i = 0; i < t; i++) {
				timeA = sc.nextInt();
				cestasA = sc.nextInt();
				timeB = sc.nextInt();
				cestasB = sc.nextInt();
											
				String winner = cestasA > cestasB ? "a" : "b";					
				int pontos = winner.equals("a") ? 2 : 1;
								
				if (times[timeA-1] == null) {						
					Resultado result = new Resultado(timeA, cestasA, cestasB);					
					result.pontos += pontos;
					times[timeA-1] = result;
				}
				else {	
					attDados(times, timeA-1, pontos, cestasA, cestasB);					
				}							
				
				pontos = winner.equals("b") ? 2 : 1;			
				
				if (times[timeB-1] == null) {					
					Resultado result = new Resultado(timeB, cestasB, cestasA);						
					result.pontos += pontos;
					times[timeB-1] = result;
				}
				else {		
					attDados(times, timeB-1, pontos, cestasB, cestasA);					
				}					
			}
							
			Arrays.sort(times, (x, y) -> {				
				if (x.pontos.equals(y.pontos)) {
					if (x.getAvgPontos().equals(y.getAvgPontos())) {							
						if (x.cestasMarcadas.equals(y.cestasMarcadas)) {							
							return x.id-y.id;
						}
						return y.cestasMarcadas-x.cestasMarcadas;
					}
					return y.getAvgPontos().compareTo(x.getAvgPontos());
				}
				return y.pontos-x.pontos;
			});
								
			StringBuilder sb = new StringBuilder();
			sb.append("Instancia " + instancia +"\n");		
						
			for (int i = 0; i < times.length; i++) {
				sb.append(times[i].id);
				if (i < times.length - 1) {
					sb.append(" ");
				}				
			}
			
			System.out.println(sb.toString());			
			n = sc.nextInt();
			instancia++;
		}		
		
		sc.close();
	}
	
	private static void attDados(Resultado[] times, int i, int pontos, int cestasA, int cestasB) {
		Resultado result = times[i];
		result.pontos += pontos;
		result.cestasMarcadas += cestasA;
		result.cestasSofridas += cestasB;						
		times[i] = result;		
	}

	public static class Resultado {
		public Integer id;
		public Integer cestasMarcadas;
		public Integer cestasSofridas;				
		public Integer pontos;
				
		public Resultado (Integer id, Integer cestasMarcadas, Integer cestasSofridas) {				
			pontos = 0;			
			this.id = id;
			this.cestasMarcadas = cestasMarcadas;
			this.cestasSofridas = cestasSofridas;			
		}
		
		public Double getAvgPontos() {
			if (cestasSofridas == 0) cestasSofridas = 1;
			return cestasMarcadas / (cestasSofridas * 1.0);
		}		
	}	
}