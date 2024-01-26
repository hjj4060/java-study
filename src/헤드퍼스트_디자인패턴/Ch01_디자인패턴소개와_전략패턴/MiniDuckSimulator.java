package 헤드퍼스트_디자인패턴.Ch01_디자인패턴소개와_전략패턴;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck duck9 = new ModelDuck();
        duck9.performFly();
        duck9.performQuack();
        duck9.setFlyBehavior(new FlyRocketPowered());
        duck9.performFly();
    }
}