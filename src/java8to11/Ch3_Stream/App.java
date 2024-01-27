package java8to11.Ch3_Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        List<String> names1 = new ArrayList<>();
        names1.add("chovy");
        names1.add("viper");
        names1.add("toby1");
        names1.add("toby2");
        names1.add("toby3");
        names1.add("gumayusi");

        names1.stream()
                .map(s -> s.toUpperCase())
                .forEach(System.out::println);

        List<String> names2 = new ArrayList<>();
        names2.add("gumayusi");
        names2.add("jeus");

        List<String> list2 = names2.stream()
                .map(s -> s.toUpperCase())
                .collect(Collectors.toList());

        List<String> names3 = new ArrayList<>();
        names3.add("faker");
        names3.add("deft");

        boolean is2 = names2.stream()
                .map(s -> s.toUpperCase())
                .anyMatch(s -> s.contains("FAKER"));

        List<String> names4 = new ArrayList<>();
        names4.add("zeka");
        names4.add("marin");

        int cnt = names4.stream()
                .mapToInt(s -> s.length())
                .sum();

        System.out.println(cnt);

        List<List<String>> lists = new ArrayList<>();
        lists.add(names1);
        lists.add(names2);
        lists.add(names3);
        lists.add(names4);

        boolean is = lists.stream()
                .flatMap(list -> list.stream())
                .map(s -> s.toUpperCase())
                .anyMatch(s -> s.contains("FAKER"));

        //System.out.println(is);

       /* boolean is2 = lists.stream()
                .flatMap(new Function<List<String>, Stream<?>>() {
                    @Override
                    public Stream<?> apply(List<String> strings) {
                        return strings.stream();
                    }
                })
                .map(s -> s.toUpperCase())
                .anyMatch(s -> s.contains("FAKER"));*/
    }
}
