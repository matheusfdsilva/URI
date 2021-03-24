package URI;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class URI_3161 {

    private static String[] fruits;
    private final static Set<String> eatFruits = new LinkedHashSet<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        readFruits(n, sc);
        readFiles(m, sc);

        for (String fruit : fruits) {
            if (eatFruits.contains(fruit)){
                System.out.println("Sheldon come a fruta " + fruit);
            }
            else {
                System.out.println("Sheldon detesta a fruta " + fruit);
            }
        }

        sc.close();
    }

    static void readFiles(int m, Scanner sc) {
        for (int i = 0; i < m; i++){
            String file = sc.next().toLowerCase();
            for (String fruit : fruits){
                String nameFruitReverse = new StringBuilder(fruit).reverse().toString();
                if (file.contains(fruit) || file.contains(nameFruitReverse)){
                    eatFruits.add(fruit);
                }
            }
        }
    }

    static void readFruits(int n, Scanner sc) {
        fruits = new String[n];
        for (int i = 0; i < n; i++) {
           fruits[i] = sc.next().toLowerCase();
        }
    }
}
