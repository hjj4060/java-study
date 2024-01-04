package 혼자_공부하는_자바.Chapter11_기본API클래스;

public class MathRandomExample {
    public static void main(String[] args) {
        int num = (int) (Math.random() * 6) + 1;
        System.out.println("주사위 눈: " + num);
    }
}
