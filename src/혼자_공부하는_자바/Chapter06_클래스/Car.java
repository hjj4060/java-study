package 혼자_공부하는_자바.Chapter06_클래스;

public class Car {
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    //기본 생성자
    public Car() {}

    Car(String model, String color) {
        //this.model = model;
        //this.color = color;
        this(model, color, 250);
    }

    Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
