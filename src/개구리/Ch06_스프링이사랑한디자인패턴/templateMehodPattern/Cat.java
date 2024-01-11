package 개구리.Ch06_스프링이사랑한디자인패턴.templateMehodPattern;

public class Cat extends Animal {
    @Override
    void play() {
        System.out.println("야옹~ 야옹~");
    }

    @Override
    void runSomthing() {
        System.out.println("야옹~ 야옹~ 꼬리 살랑 살랑~");
    }
}
