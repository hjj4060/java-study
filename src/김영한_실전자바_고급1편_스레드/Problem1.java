package 김영한_실전자바_고급1편_스레드;

import static 김영한_실전자바_고급1편_스레드.MyLogger.log;

public class Problem1 {

    public static void main(String[] args) {
        CounterThread counterThread = new CounterThread();
        counterThread.start();
    }

    static class CounterThread extends Thread {
        @Override
        public void run() {
            try {
                for (int i = 1; i <= 5; i++) {
                    log(i);
                    sleep(1000);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
