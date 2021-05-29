package URI;

import java.util.Scanner;

public class URI_3209 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int filtros = sc.nextInt();
            int aparelhos = 1;
            for (int j = 0; j < filtros; j++){
                aparelhos += sc.nextInt() - 1;
            }

            System.out.println(aparelhos);
        }

        sc.close();
    }
}
