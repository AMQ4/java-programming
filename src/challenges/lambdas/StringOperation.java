package challenges.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.BiPredicate;
import java.util.function.UnaryOperator;

public class StringOperation {
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

        List<UnaryOperator<String>> functionas = new ArrayList<>(3);
        functionas.add(String::toUpperCase);
        functionas.add(StringOperation::appendRandMiddleInitial);
        functionas.add(StringOperation::appendLastName);
        BiPredicate<String, String> removeIf = String::equals;


        apply(names, functionas);

        List<String> modifiableNames = new ArrayList<>(Arrays.asList(names));
        modifiableNames.removeIf(
                (s) -> s.substring(0, s.indexOf(' ')).equals((s.substring(s.lastIndexOf(" ") + 1) ))
        );
        System.out.println(modifiableNames);
    }

    public static String appendRandMiddleInitial(String names){
        Random rand = new Random();
        return names + " " +  (char)rand.nextInt(65, 91) + ".";
    }

    public static String appendLastName(String name) {
        return name + " " + new StringBuilder(name.substring(0, name.indexOf(" "))).reverse();
    }

    public static void apply(String[] array, List<UnaryOperator<String>> operators){
        var arrayList = Arrays.asList(array);

        for (UnaryOperator<String> operator: operators) {
            arrayList.replaceAll(operator);
            System.out.println(arrayList);
        }
    }
}
