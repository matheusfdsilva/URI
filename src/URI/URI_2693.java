package URI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class URI_2693 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			int n = sc.nextInt();
			List<Student> list = new ArrayList<>();			
			for (int i = 0; i < n; i++) {
				String nome = sc.next();
				char regiao = sc.next().charAt(0);
				int dist = sc.nextInt();
				list.add(new Student(nome, regiao, dist));
			}
			
			list = list.stream().sorted(Comparator.comparing(Student::getNome))
						.sorted(Comparator.comparing(Student::getRegiao))
						.sorted(Comparator.comparing(Student::getDist)).collect(Collectors.toList());
						
			list.forEach(student -> System.out.println(student.getNome()));			
		}		
		
		sc.close();		
	}
	
	public static class Student {		
		private String nome;
		private char regiao;
		private int dist;
		
		public Student(String nome, char regiao, int dist) {
			this.nome = nome;
			this.regiao = regiao;
			this.dist = dist;
		}

		public String getNome() {
			return nome;
		}

		public char getRegiao() {
			return regiao;
		}

		public int getDist() {
			return dist;
		}		
	}
}