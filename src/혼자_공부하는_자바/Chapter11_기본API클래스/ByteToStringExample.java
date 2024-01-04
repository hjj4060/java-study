package 혼자_공부하는_자바.Chapter11_기본API클래스;

public class ByteToStringExample {
    public static void main(String[] args) {
        byte[] bytes = {33, 34, 108, 108, 111, 32, 74, 97, 118, 97};

        String str1 = new String(bytes);
        System.out.println(str1);

        String str2 = new String(bytes, 6, 4);
        System.out.println(str2);
    }
}
