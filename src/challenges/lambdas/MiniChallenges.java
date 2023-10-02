package challenges.lambdas;

import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class MiniChallenges {
    public static void main(String[] args) {

        //Challenge1: rewrite this as a lambda var:
        Consumer<String> printTheParts = new Consumer<>(){
            @Override
            public void accept(String s) {
                String[] parts = s.split(" ");
                for (String part: parts) {
                    System.out.println(part);
                }
            }
        };

        Consumer<String> lambdaPrintTheParts = (String s) -> {
            String[] parts = s.split(" ");
            for (String part: parts) {
                System.out.println(part);
            }
        };

        //Challenge2: rewrite the method below as a lambda var:
        UnaryOperator<String> operator = (String source) -> {
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < source.length(); i++) {
                if (i % 2 ==1 ){
                    result.append(source.charAt(i));
                }
            }
            return result.toString();
        };

        //Challenge 3: use the lambda in ch2
        System.out.println(operator.apply("1234567890"));

        //Challenge 4: use the lambda in ch2 as a method parm
        //Challenge 5: call it
        System.out.println(everySecondCar("1234567890", operator));

        //Challenge 6: assign a lambda to a Supplier interface and make it returns: I love JAVA
        Supplier<String> supplier = () -> "I love JAVA. (the challenge asks me to write this)";

        //Challenge 7: call it
        System.out.println(supplier.get());
    }

    public static String everySecondCar(String source){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < source.length(); i++) {
            if (i % 2 ==1 ){
                result.append(source.charAt(i));
            }
        }
        return result.toString();
    }

    public static String everySecondCar(String source, UnaryOperator<String> operator){
        return operator.apply(source);
    }
}