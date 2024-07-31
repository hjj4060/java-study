package 김영한_실전자바_고급1편_스레드;

import static 김영한_실전자바_고급1편_스레드.MyLogger.log;

public class InnerRunnableMainV4 {
    public static void main(String[] args) {
        log("main() start");

        Thread thread = new Thread(() -> log("run()"));
        thread.start();

        log("main() end");
    }
}
