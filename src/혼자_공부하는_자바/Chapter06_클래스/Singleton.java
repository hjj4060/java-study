package 혼자_공부하는_자바.Chapter06_클래스;

public class Singleton {
    private static Singleton singleton  = new Singleton();

    private Singleton() {};

    static Singleton getInstance() {
        return singleton;
    }
}
