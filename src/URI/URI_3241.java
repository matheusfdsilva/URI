package URI;

import java.util.Scanner;

public class URI_3241 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String op = sc.next();
            int indexSoma = op.indexOf("+");
            if (indexSoma == -1) {
                System.out.println("skipped");
            }
            else {
                int a = Integer.parseInt(op.substring(0, indexSoma));
                int b = Integer.parseInt(op.substring(indexSoma+1));
                System.out.println(a + b);
            }
        }

        sc.close();
    }
}
