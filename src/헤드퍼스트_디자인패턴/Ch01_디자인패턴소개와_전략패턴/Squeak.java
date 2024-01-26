package 헤드퍼스트_디자인패턴.Ch01_디자인패턴소개와_전략패턴;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("삑");
    }
}
