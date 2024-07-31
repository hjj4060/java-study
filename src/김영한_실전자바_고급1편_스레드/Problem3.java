package 김영한_실전자바_고급1편_스레드;

import static 김영한_실전자바_고급1편_스레드.MyLogger.log;
import static 김영한_실전자바_고급1편_스레드.ThreadUtil.sleep;

public class Problem3 {
    public static void main(String[] args) {
        PrintWork a = new PrintWork("A", 1000);
        PrintWork b = new PrintWork("B", 500);

        Thread thread = new Thread(a, "Thread-A");
        Thread thread1 = new Thread(b, "Thread-B");


        thread.start();
        thread1.start();
    }

    static class PrintWork implements Runnable {
        private String content;
        private int sleepMs;

        public PrintWork(String content, int sleepMs) {
            this.content = content;
            this.sleepMs = sleepMs;
        }

        @Override
        public void run() {
            while (true) {
                log(content);
                sleep(sleepMs);
            }
        }
    }
}
