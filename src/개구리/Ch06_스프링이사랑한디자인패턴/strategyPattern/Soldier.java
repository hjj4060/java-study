package 개구리.Ch06_스프링이사랑한디자인패턴.strategyPattern;

public class Soldier {
    void runContext(Strategy strategy) {
        System.out.println("전투 시작");
        strategy.runStrategy();
        System.out.println("전투 종료");
    }
}