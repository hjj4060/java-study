package 혼자_공부하는_자바.Chapter02_변수와타입;

import java.io.IOException;

public class KeyCodeExample {
    public static void main(String[] args) throws IOException {
        int keyCode;

        keyCode = System.in.read();
        System.out.println("keyCode: " + keyCode);

        keyCode = System.in.read();
        System.out.println("keyCode: " + keyCode);

        keyCode = System.in.read();
        System.out.println("keyCode: " + keyCode);
    }
}
