package java8to11.Ch1_함수형인터페이스와람다;

import java.util.Arrays;

public class GreetingTest {
    public static void main(String[] args) {
        String[] names = {"keesun", "whiteship", "toby", "keesun"};

        Arrays.stream(names).distinct();




    }
}
