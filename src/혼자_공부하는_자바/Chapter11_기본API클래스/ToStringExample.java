package 혼자_공부하는_자바.Chapter11_기본API클래스;

import java.util.Date;

public class ToStringExample {
    public static void main(String[] args) {
        Object obj1 = new Object();
        Date obj2 = new Date();

        System.out.println(obj1.toString());
        System.out.println(obj2.toString());
    }
}
