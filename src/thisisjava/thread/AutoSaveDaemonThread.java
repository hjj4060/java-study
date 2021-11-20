package thisisjava.thread;

/*
    데몬 스레드는 주 스레드의 작업을 돕는 보조적인 역할을 수행하는 스레드이다.
    주 스레드가 종료되면 데몬 스레드는 강제적으로 자동 종료 된다.
 */

public class AutoSaveDaemonThread extends Thread {
    public void save() {
        System.out.println("작업 내용을 저장함.");
    }

    @Override
    public void run() {
        while(true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                break;
            }
            save();
        }
    }
}
