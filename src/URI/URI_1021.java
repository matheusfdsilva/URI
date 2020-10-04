package URI;

import java.util.Locale;
import java.util.Scanner;

public class URI_1021 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int nota100, nota50, nota20, nota10, nota5, nota2,

				moeda1, moeda050, moeda025, moeda010, moeda005, moeda001;

		double n, resto;

		n = sc.nextDouble();

		nota100 = (int) (n / 100.0);

		resto = n % 100.0;

		nota50 = (int) (resto / 50.0);

		resto = resto % 50.0;

		nota20 = (int) (resto / 20.0);

		resto = resto % 20.0;

		nota10 = (int) (resto / 10.0);

		resto = resto % 10.0;

		nota5 = (int) (resto / 5.0);

		resto = resto % 5.0;

		nota2 = (int) (resto / 2.0);

		resto = resto % 2.0;

		moeda1 = (int) (resto / 1.0);

		resto = resto % 1.0;

		moeda050 = (int) (resto / 0.50);

		resto = resto % 0.50;

		moeda025 = (int) (resto / 0.25);

		resto = resto % 0.25;
		System.out.println(resto);

		moeda010 = (int) (resto / 0.10);

		resto = resto % 0.10;

		moeda005 = (int) (resto / 0.05);

		resto = resto % 0.05;

		moeda001 = (int) (resto / 0.01);

		resto = resto % 0.01;

		System.out.println("NOTAS:");

		System.out.println(nota100 + " nota(s) de R$ 100.00");

		System.out.println(nota50 + " nota(s) de R$ 50.00");

		System.out.println(nota20 + " nota(s) de R$ 20.00");

		System.out.println(nota10 + " nota(s) de R$ 10.00");

		System.out.println(nota5 + " nota(s) de R$ 5.00");

		System.out.println(nota2 + " nota(s) de R$ 2.00");

		System.out.println("MOEDAS:");

		System.out.println(moeda1 + " moeda(s) de R$ 1.00");

		System.out.println(moeda050 + " moeda(s) de R$ 0.50");

		System.out.println(moeda025 + " moeda(s) de R$ 0.25");

		System.out.println(moeda010 + " moeda(s) de R$ 0.10");

		System.out.println(moeda005 + " moeda(s) de R$ 0.05");

		System.out.println(moeda001 + " moeda(s) de R$ 0.01");

		sc.close();

	}

}
