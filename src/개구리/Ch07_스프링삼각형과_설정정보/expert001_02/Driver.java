package 개구리.Ch07_스프링삼각형과_설정정보.expert001_02;

public class Driver {
    public static void main(String[] args) {
        Tire tire = new KoreaTire();
        Car car = new Car(tire);

        System.out.println(car.getTireBrand());
    }
}