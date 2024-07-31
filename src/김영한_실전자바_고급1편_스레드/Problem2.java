package 김영한_실전자바_고급1편_스레드;

import static 김영한_실전자바_고급1편_스레드.MyLogger.log;

public class Problem2 {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    log(i);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }, "work");

        thread.start();
    }

}
