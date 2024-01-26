package 개구리.Ch06_스프링이사랑한디자인패턴.factoryMethodPattern;

public class Dog extends Animal {
    @Override
    AnimalToy getToy() {
        return new DogToy();
    }
}
