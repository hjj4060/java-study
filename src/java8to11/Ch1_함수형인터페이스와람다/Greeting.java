package java8to11.Ch1_함수형인터페이스와람다;

public class Greeting {
    private String name;

    public Greeting() {

    }

    public Greeting(String name) {
        this.name = name;
    }

    public String hello(String name) {
        return "hello " + name;
    }

    public static String hi(String name) {
        return "hi " + name;
    }
}
