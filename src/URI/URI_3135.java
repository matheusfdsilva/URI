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
            Optional<String> opt = getNextName(nextName.length(), names);
            if (opt.isPresent()){
                System.out.print(", " + opt.get());
            }
            else {
                opt = getNextName(0, names);
                System.out.print("\n" + opt.get());
            }
            nextName = opt.get();
            names.remove(nextName);
        }

        System.out.println();
    }

    private static Optional<String> getNextName(int nameLength, List<String> names) {
        return names.stream().filter(x -> x.length() > nameLength).findFirst();
    }
}

