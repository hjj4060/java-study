package java8to11.Ch1_함수형인터페이스와람다;

public class Foo {
    public static void main(String[] args) {
        RunSomething runSomething = new RunSomething() {
            @Override
            public void doIt() {
                System.out.println("hello");
            }
        };

        runSomething.doIt();

        RunSomething runSomething2 = () -> System.out.println("hello");
        runSomething.doIt();

    }
}
