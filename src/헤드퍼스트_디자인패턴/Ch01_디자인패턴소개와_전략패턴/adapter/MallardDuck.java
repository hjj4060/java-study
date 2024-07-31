package 헤드퍼스트_디자인패턴.Ch01_디자인패턴소개와_전략패턴.adapter;

public class MallardDuck implements Duck {
    public void quack() {
        System.out.println("꽥");
    }

    @Override
    public void fly() {
        System.out.println("날고 있어요");
    }
}
