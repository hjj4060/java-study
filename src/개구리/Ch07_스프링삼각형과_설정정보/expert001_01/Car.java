package 개구리.Ch07_스프링삼각형과_설정정보.expert001_01;

public class Car {
    Tire tire;

    public Car() {
        tire = new KoreaTire();
        // tire = new AmericaTire();
    }

    public String getTireBrand() {
        return "장착된 타이어:" + tire.getBrand();
    }

}
