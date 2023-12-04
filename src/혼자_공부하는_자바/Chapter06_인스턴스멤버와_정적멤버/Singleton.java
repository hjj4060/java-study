package 혼자_공부하는_자바.Chapter06_인스턴스멤버와_정적멤버;

public class Singleton {
    private static Singleton singleton  = new Singleton();

    private Singleton() {};

    static Singleton getInstance() {
        return singleton;
    }
}
