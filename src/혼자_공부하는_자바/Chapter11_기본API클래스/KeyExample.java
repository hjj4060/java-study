package 혼자_공부하는_자바.Chapter11_기본API클래스;

import java.util.HashMap;

public class KeyExample {
    public static void main(String[] args) {
        HashMap<Key, String> hashMap = new HashMap<>();

        hashMap.put(new Key(1), "홍길동");

        String value = hashMap.get(new Key(1));
        System.out.println(value);
    }
}