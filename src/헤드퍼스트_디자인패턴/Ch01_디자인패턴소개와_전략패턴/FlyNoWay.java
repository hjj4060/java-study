package 헤드퍼스트_디자인패턴.Ch01_디자인패턴소개와_전략패턴;

public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("저는 못 날아요!");
    }
 }