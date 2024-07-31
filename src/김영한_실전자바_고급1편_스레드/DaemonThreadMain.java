package 김영한_실전자바_고급1편_스레드;

public class DaemonThreadMain {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + ": main() start");
        HelloThread helloThread = new HelloThread();
//        helloThread.setDaemon(true);
        helloThread.start();
        System.out.println(Thread.currentThread().getName() + " main() end");
    }
}
