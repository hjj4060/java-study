package 개구리.Ch06_스프링이사랑한디자인패턴.templateMehodPattern;

public class Dog extends Animal {
    @Override
    void play() {
        System.out.println("멍! 멍!");
    }

    @Override
    void runSomthing() {
        System.out.println("멍! 멍!~ 꼬리 살랑 살랑~");
    }
}
