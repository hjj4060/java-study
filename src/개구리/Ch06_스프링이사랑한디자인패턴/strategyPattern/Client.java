package 개구리.Ch06_스프링이사랑한디자인패턴.strategyPattern;

public class Client {
    public static void main(String[] args) {
        Strategy strategy = null;
        Soldier rambo = new Soldier();

        strategy = new StrategyGun();
        rambo.runContext(strategy);

        System.out.println();

        strategy = new StrategySword();
        rambo.runContext(strategy);

        System.out.println();

        strategy = new StrategyBow();
        rambo.runContext(strategy);
    }
}
