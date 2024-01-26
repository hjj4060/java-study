package 헤드퍼스트_디자인패턴.Ch01_디자인패턴소개와_전략패턴;

public class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("꽥");
    }
}