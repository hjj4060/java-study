package thisisjava.thread;

public class DaemonExample {
    public static void main(String[] args) {
        AutoSaveDaemonThread autoSaveDaemonThread = new AutoSaveDaemonThread();
        autoSaveDaemonThread.setDaemon(true); //AutoSaveDaemonThread를 데몬스레드로 만든다.
        autoSaveDaemonThread.start();

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //메인 스레드가 종료 되면서 autoSaveDaemonThread가 같이 종료 된다.
        System.out.println("메인 스레드 종료");
    }
}
