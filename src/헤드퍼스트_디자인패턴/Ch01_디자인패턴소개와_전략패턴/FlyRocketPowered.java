package 헤드퍼스트_디자인패턴.Ch01_디자인패턴소개와_전략패턴;

public class FlyRocketPowered implements FlyBehavior {
    public void fly() {
        System.out.println("로켓 추진으로 날아갑니다.");
    }
 }