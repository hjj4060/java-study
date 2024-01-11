package 개구리.Ch06_스프링이사랑한디자인패턴.strategyPattern;

public class StrategyBow implements Strategy {
    @Override
    public void runStrategy() {
        System.out.println("슝.. 쐐액.. 쉑, 최종 병기");
    }
}
