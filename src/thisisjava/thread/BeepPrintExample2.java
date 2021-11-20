package thisisjava.thread;

import java.awt.*;

//메인 스레드와 작업 스레드가 동시에 실행
public class BeepPrintExample2 {
    public static void main(String[] args) {
        /*
            작업스레드 만드는 3가지 방법

            1번째 방법(클래스에서 run 구현후 객체 생성)
            Runnable beepTask = new BeepTask(); //객체 생성
            Thread thread = new Thread(beepTask); //작업스레드 생성

            2번째 방법(Runnable 익명 객체 이용)
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    Toolkit toolkit = Toolkit.getDefaultToolkit();
                    for(int i=0; i<5; i++) {
                        toolkit.beep();
                        try { Thread.sleep(500); } catch (Exception e) {}
                    }
                }
            });
        */
        //3번째 방법 람다식 이용
        Thread thread = new Thread(() -> {
            Toolkit toolkit = Toolkit.getDefaultToolkit();
            for(int i=0; i<5; i++) {
                toolkit.beep();
                try { Thread.sleep(500); } catch (Exception e) {}
            }
        });
        thread.start();

        for(int i=0; i<5; i++) {
            System.out.println("띵");
            try { Thread.sleep(500); } catch (Exception e) {}
        }
    }
}
