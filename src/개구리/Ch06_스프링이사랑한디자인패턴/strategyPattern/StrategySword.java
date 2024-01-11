package 개구리.Ch06_스프링이사랑한디자인패턴.strategyPattern;

public class StrategySword implements Strategy {
    @Override
    public void runStrategy() {
        System.out.println("챙.. 채쟁챙 챙챙");
    }
}
