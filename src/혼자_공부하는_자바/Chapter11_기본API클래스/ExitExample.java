package 혼자_공부하는_자바.Chapter11_기본API클래스;

public class ExitExample {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if (i == 5) {
                System.exit(0);
                //break;
            }
        }
        System.out.println("마무리 코드");
    }
}
