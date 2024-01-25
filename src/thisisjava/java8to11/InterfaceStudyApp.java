package thisisjava.java8to11;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Spliterator;

public class InterfaceStudyApp {
    public static void main(String[] args) {
        InterfaceChangeStudy study = new InterfaceChangeStudyClass("hyunsu");
        //study.printName(); //hyunsu
        //study.printNameUpperCase(); //HYUNSU

        //InterfaceChangeStudy.printInterfaceName(); //InterfaceChangeStudy

        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("hyunsu");
        nameList.add("lufy");
        nameList.add("ohgong");
        nameList.add("vegeta");
        nameList.add("naruto");

        //일반적인 forEach 출력
        for (String s : nameList) {
            System.out.println(s);
        }

        //람다로 변경
        nameList.forEach(s -> {
            System.out.println(s);
        });

        //람다는 메서드 레퍼런스로 변경 가능하다.
        nameList.forEach(System.out::println);
        System.out.println();
        System.out.println("================");

        Spliterator<String> spliterator = nameList.spliterator();
        Spliterator<String> spliterator1 = spliterator.trySplit();
        while (spliterator.tryAdvance(System.out::println)) ;
        System.out.println("================");
        while (spliterator1.tryAdvance(System.out::println)) ;

        long k = nameList.stream().map(String::toUpperCase)
                .filter(s -> s.startsWith("K"))
                .count();

        //k로 시작하는 리스트 지우기
        nameList.removeIf(s -> s.startsWith("k"));

        //리스트 정렬
        nameList.sort(String::compareToIgnoreCase);

        //리스트 역정렬
        Comparator<String> compareToIgnoreCase = String::compareToIgnoreCase;
        nameList.sort(compareToIgnoreCase.reversed());

    }
}
