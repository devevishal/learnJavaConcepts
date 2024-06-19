package org.learn.lambda;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class lambda {




    public static void main(String[] args) {

        // Predicate
        Predicate<String>  isStringLengthGraterThan5 = (s) -> s.length() > 5;
        //System.out.println(isStringLengthGraterThan5.test("Raman"));
        List<String> name = Arrays.asList("Raman", "Anand", "Shrivastava");
        name.stream().filter(isStringLengthGraterThan5).forEach(System.out::println);


        // Function
        Function<String, Integer> length = (s) -> s.length();
      //  System.out.println(length.apply("Raman"));

        // Consumer

        Consumer<String> consumer = (s) -> System.out.println(s.toLowerCase());
        consumer.accept("Raman");


        // Supplier
        Supplier<String> supplier = () -> "Supplier";
        System.out.println(supplier.get());


        // BinaryOperator
        BinaryOperator<String> binaryOperator = (s1, s2) -> s1 + s2;
        System.out.println(binaryOperator.apply("Raman", " Anand"));

        // UnaryOperator
        UnaryOperator<String> unaryOperator = (s) -> s.toUpperCase();
        System.out.println(unaryOperator.apply("Raman"));

        //  BiFunction
        BiFunction<String, String, String> biFunction = (s1, s2) -> s1 + s2;
        System.out.println(biFunction.apply("Raman", " Anand"));


        MyFunctionalInterface myFunctionalInterface = (a, b) -> a + b;
        System.out.println(myFunctionalInterface.calculate(1, 2));






    }


}
