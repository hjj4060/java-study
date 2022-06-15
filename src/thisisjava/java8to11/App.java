package thisisjava.java8to11;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class App {
    public static void main(String[] args) {

        //1. 스태틱 메서드 참조
        //Greeting클래스의 스태틱 메서드 hi를 사용하겠다.
        UnaryOperator<String> hi = Greeting::hi; // 콜론두개(::) 찍혀있으면 메서드 레퍼런스이다.
        //UnaryOperator<String> hi = (s) -> "hi " + s; 이거와 동일한 기능

        //2. 특정 객체의 인스턴스 메서드 참조
        //Greeting greeting = new Greeting();
        //UnaryOperator<String> hello = greeting::hello;

        //3. 생성자 메서드 참조
        Supplier<Greeting> newGreeting = Greeting::new; //Supplier 객체 생성
        Greeting greeting = newGreeting.get(); //실질적 Greeting 객체 생성

        Function<String, Greeting> hyunsuGreeting = Greeting::new;
        Greeting hyunsu = hyunsuGreeting.apply("hyunsu");

        //4. 임의 객체의 인스턴스 메서드 참조
        String[] names = {"hyunsu", "java", "spring"};

        //Comparator가 함수형 인터페이스 이기 때문에 람다로 변경 할 수 있다.
        Arrays.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        });

        //람다로 변경할수 있는건 레퍼런스로 변경 가능하다.
        Arrays.sort(names, (o1, o2) -> 0);

        //람다는 메서드 레퍼런스를 쓸 수 있다.
        //문자열과 문자열을 비교해서 int값을 return.
        //스태틱 메서드 참조가 아닌 임의의 객체의 인스턴스 참조한 경우이다.
        Arrays.sort(names, String::compareToIgnoreCase);
    }
}
