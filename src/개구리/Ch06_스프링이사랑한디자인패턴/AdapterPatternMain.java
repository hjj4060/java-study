package 개구리.Ch06_스프링이사랑한디자인패턴;

public class AdapterPatternMain {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.walk(); //dog walking
        cat.walk(); //cat walking

        FishAdapter fishAdapter = new FishAdapter(new Fish());
        fishAdapter.walk(); //fish walking
        fishAdapter.fish.swim(); //fish swimming
    }
}