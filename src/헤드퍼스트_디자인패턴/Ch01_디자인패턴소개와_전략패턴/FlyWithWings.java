package 헤드퍼스트_디자인패턴.Ch01_디자인패턴소개와_전략패턴;

public class FlyWithWings implements FlyBehavior {
    public void fly() {
        System.out.println("날고 있어요!");
    }
}
