package URI;

import java.util.*;

public class URI_3135 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<String> names = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            names.add(name);
        }

        names.sort(Comparator.comparingInt(String::length));

        String firstName = names.get(0);
        names.remove(0);
        System.out.print(firstName);
        String nextName = firstName;

        while (names.size() > 0) {
            if (hasBiggerLength(nextName, names)){
                nextName = getNextName(nextName.length(), names);
                System.out.print(", " + nextName);
            }
            else {
                nextName = getNextName(0, names);
                System.out.print("\n" + nextName);
            }
        }

        System.out.println();
    }

    private static String getNextName(int nameLength, List<String> names) {
        String nextName =  names.stream().filter(x -> x.length() > nameLength).findFirst().get();
        names.remove(nextName);
        return nextName;
    }

    private static boolean hasBiggerLength(String firstName, List<String> names) {
        String name = names.stream().filter(x -> x.length() > firstName.length()).findFirst().orElse(null);
        return name != null;
    }
}

