package 혼자_공부하는_자바.Chapter10_예외처리;

public class TryCatchFinallyExample {
    public static void main(String[] args) {
        try {
            Class clazz = Class.forName("java.lang.String2");
        } catch (ClassNotFoundException e) {
            System.out.println("클래스가 존재하지 않습니다");
        }
    }
}
