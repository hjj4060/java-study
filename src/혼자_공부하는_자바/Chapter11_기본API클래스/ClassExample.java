package 혼자_공부하는_자바.Chapter11_기본API클래스;

import 혼자_공부하는_자바.Chapter06_클래스.Car;

public class ClassExample {
    public static void main(String[] args) throws ClassNotFoundException {
        Class clazz1 = Car.class;
        Class clazz2 = Class.forName("혼자_공부하는_자바.Chapter06_클래스.Car");

        Car car = new Car();
        Class clazz3 = car.getClass();

        System.out.println(clazz1.getName());
        System.out.println(clazz2.getSimpleName());
        System.out.println(clazz3.getPackage().getName());

        String photo = clazz1.getResource("photo1.png").getPath();
        System.out.println(photo);
    }
}
