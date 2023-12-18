package 혼자_공부하는_자바.Chapter07_상속;

public class Car {
    String name;
    int maxSpeed;

    Car() {

    }

    Car(String name, int maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
    }

    void maxSpeedPlus() {
        maxSpeed += 5;
    }

    void setMaxSpeedMinus() {
        maxSpeed -= 5;
    }
}
