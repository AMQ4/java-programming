package challenges.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.IntFunction;

public class Main {
    public static void main(String[] args) {
        String[] names = {
                "Emma",
                "Liam",
                "Olivia",
                "Noah",
                "Ava",
                "Sophia",
                "Jackson",
                "Isabella",
                "Lucas",
                "Mia",
                "Bob",
                "Anna"
        };

        IntFunction<String> toUpper = (i) -> names[i].toUpperCase();
        Arrays.setAll(names, toUpper);

        Arrays.asList(names).forEach((s) -> System.out.println(s));
        System.out.println("- ".repeat(10) + "\nAdd random middle initial:");

        Random rand = new Random();

        Arrays.setAll(names, i -> {
            StringBuilder stringBuilder = new StringBuilder(names[i]);
            stringBuilder.insert(stringBuilder.length()/2, (char)rand.nextInt(65, 91));
            stringBuilder.append('.');
            return stringBuilder.toString();
        });

        Arrays.asList(names).forEach((s) -> System.out.println(s));
        System.out.println("- ".repeat(10) + "\nAdd last names:");

        Arrays.setAll(names, i -> {
            StringBuilder stringBuilder = new StringBuilder(names[i]).reverse();
            return names[i] + stringBuilder.substring(1, stringBuilder.length());
        });

        Arrays.asList(names).forEach((s) -> System.out.println(s));
        System.out.println("- ".repeat(10) + "\nRemove names with last name equals to the first name:");

        List<String> modifiedNames = new ArrayList<>(Arrays.asList(names));

        modifiedNames.removeIf(
                s -> s.substring(0, s.length()/2).equals(s.substring(s.length()/2 +1))
        );

        modifiedNames.forEach((s) -> System.out.println(s));
    }
}
