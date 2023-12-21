package 혼자_공부하는_자바.Chapter07_상속;

public class AvanteCar extends Car {
    String name;

    @Override
    void maxSpeedPlus() {
        maxSpeed += 20;
    }
}
