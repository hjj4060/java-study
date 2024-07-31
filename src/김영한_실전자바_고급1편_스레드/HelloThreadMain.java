package 김영한_실전자바_고급1편_스레드;

public class HelloThreadMain {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());

        HelloThread thread = new HelloThread();
        thread.start();

        System.out.println(Thread.currentThread().getName());
    }
}
