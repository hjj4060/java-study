package 헤드퍼스트_디자인패턴.Ch01_디자인패턴소개와_전략패턴;

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("저는 물오리 입니다.");
    }
}