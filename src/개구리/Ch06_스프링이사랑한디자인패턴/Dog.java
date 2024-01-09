package 개구리.Ch06_스프링이사랑한디자인패턴;

public class Dog implements Animal {
    @Override
    public void walk() {
        System.out.println("dog walking");
    }
}