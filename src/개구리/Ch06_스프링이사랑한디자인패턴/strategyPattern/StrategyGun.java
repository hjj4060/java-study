package 개구리.Ch06_스프링이사랑한디자인패턴.strategyPattern;

public class StrategyGun implements Strategy {
    @Override
    public void runStrategy() {
        System.out.println("탕, 타당, 타다당");
    }
}
