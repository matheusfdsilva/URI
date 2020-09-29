package URI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class URI_1258 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<String>list = new ArrayList<>();
		int caso = 0;
		int n = sc.nextInt();
		
		while (n != 0) {	
			if (caso > 0) {
				System.out.println();
			}
			
			for (int i = 0; i < n; i++) {
				sc.nextLine();
				String name = sc.nextLine();
				String color = sc.next();
				String size = sc.next();
				list.add(color + " " + size + " " + name);
			}
			
			Collections.sort(list);			
					
			List<Shirt> newList = list.stream().map(x -> new Shirt(x)).collect(Collectors.toList());
			
			printer(newList, "branco");
			printer(newList, "vermelho");						
			
			list.clear();
			caso++;
			n = sc.nextInt();
		}				
		
		sc.close();
	}
	
	public static class Shirt implements Comparable<Shirt> {
		
		public String color;
		public String size;
		public String name;
		
		public Shirt(String string) {
			String[]fields = string.split(" ");
			color = fields[0];
			size = fields[1];
			String temp = "";
			for (int i = 2; i < fields.length; i++) {
				temp += fields[i] + " ";
			}
			name = temp.trim();
		}

		@Override
		public int compareTo(Shirt o) {
			return -size.compareTo(o.size);
		}	
		
		@Override
		public String toString() {
			return color + " " + size + " " + name;
		}
	}
		
	public static void printer(List<Shirt> list, String color) {
		List<Shirt> newList = list.stream().filter(x -> x.color.equals(color)).collect(Collectors.toList());
		Collections.sort(newList);
		newList.forEach(System.out::println);
	}
}