package 개구리.Ch06_스프링이사랑한디자인패턴;

public class FishAdapter implements Animal {
    Fish fish = new Fish();

    public FishAdapter(Fish fish) {
        this.fish = new Fish();
    }

    @Override
    public void walk() {
        System.out.println("fish walking");
    }
}
