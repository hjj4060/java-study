package thisisjava.thread;

public class WorkerThread extends Thread {
    //Thread를 상속한 후 run 메소드를 재정의(overriding)해서 스레드가 실행할 코드를 작성함
    @Override
    public void run() {
        //스레드가 실행할 코드
        System.out.println("스레드 실행1");
    }

    public static void main(String[] args) {
        Thread workerThread = new WorkerThread();
        workerThread.run();

        Thread thread = new Thread() {
            @Override
            public void run() {
                System.out.println("스레드 실행2");
            }
        };
        thread.run();

        //Runnable은 run만 구현가능하다.
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("스레드 실행3");
            }
        };
        runnable.run();
    }
}
