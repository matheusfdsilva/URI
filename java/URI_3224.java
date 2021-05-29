package URI;

import java.util.Scanner;

public class URI_3224 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String jon = sc.next();
        String doct = sc.next();

        System.out.println(jon.length() >= doct.length() ? "go" : "no");

        sc.close();
    }
}
