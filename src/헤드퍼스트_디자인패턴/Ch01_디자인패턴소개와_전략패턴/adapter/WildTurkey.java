package 헤드퍼스트_디자인패턴.Ch01_디자인패턴소개와_전략패턴.adapter;

public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("골골");
    }

    @Override
    public void fly() {
        System.out.println("짧은 거리를 날고 있어요");
    }
}
