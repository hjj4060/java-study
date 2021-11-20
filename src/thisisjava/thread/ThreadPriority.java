package thisisjava.thread;

public class ThreadPriority {
    public static void main(String[] args) {
        Thread th1 = new Thread() {
            @Override
            public void run() {
                for (int i=0; i<5; i++) {
                    System.out.println(getName() + " : " + i);
                }
            }
        };

        Thread th2 = new Thread() {
            @Override
            public void run() {
                for (int i=5; i<10; i++) {
                    System.out.println(getName() + " : " + i);
                }
            }
        };
        // 스레드 이름 변경
        th1.setName("스레드 1");
        th2.setName("스레드 2");

        // 스레드 우선순위 변경하여 특정 스레드가 더 많은 작업시간을 갖도록 할 수 있다.
        th1.setPriority(1);
        th2.setPriority(10);

        th1.start();
        th2.start();
    }
}
