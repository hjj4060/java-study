package java8to11.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> intStream = list.stream();
        //intStream.forEach(System.out::print);
        //메소드 레퍼런스 -> 람다
        //intStream.forEach((i) -> System.out.println(i));

        //람다 -> 익명 클래스
        intStream.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });
        //intStream.forEach(System.out::print); //forEach가 최종연산이여서 stream 이미 닫힘



        String[] strArr = new String[]{"a", "b", "c"};
        Stream<String> strStream = Stream.of(strArr);
        strStream.forEach(System.out::println);

        Integer[] intArr1 = {1, 2, 3, 4, 5};
        Stream<Integer> intStream1 = Arrays.stream(intArr1);
        intStream1.forEach(System.out::println);

        int[] intArr2 = {1, 2, 3, 4, 5};
        IntStream intStream2 = Arrays.stream(intArr2);
        intStream2.forEach(System.out::println);
    }
}
