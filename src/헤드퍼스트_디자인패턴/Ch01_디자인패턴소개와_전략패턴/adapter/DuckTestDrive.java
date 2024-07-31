package 헤드퍼스트_디자인패턴.Ch01_디자인패턴소개와_전략패턴.adapter;

public class DuckTestDrive {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();

        Turkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

    }
}
