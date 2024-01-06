package 혼자_공부하는_자바.Chapter13_컬렉션프레임워크;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {
    public static void main(String[] args) throws IOException {
        OutputStream os = new FileOutputStream("C:/Temp/test1.db");

        byte a = 100;
        byte b = 50;
        byte c = 80;

        os.write(a);
        os.write(b);
        os.write(c);

        os.flush();
        os.close();
    }
}
