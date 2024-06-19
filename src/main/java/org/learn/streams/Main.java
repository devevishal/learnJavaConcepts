package org.learn.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {


        List<String> names = Arrays.asList("Raman", "Anand", "Shrivastava");

        Predicate<String> p = (s) -> s.length() > 7;
        // filter
        names.stream().filter(p).collect(Collectors.toList());


        Function<String, Integer> function = (s) -> s.length();

        // map
        names.stream().filter(p).map(function).collect(Collectors.toList()).forEach(System.out::println);


        List<Integer> numbers = Arrays.asList( 1, 2, 3, 4, 5);

        int value = numbers.stream().filter(i-> i%2 == 0).map(x -> x).
                reduce(4, Integer::sum);

        System.out.println(value);


    }
}
