package 혼자_공부하는_자바.Chapter11_기본API클래스;

public class SystemTimeExample {
    public static void main(String[] args) {
        long time1 = System.currentTimeMillis();

        int sum = 0;
        for (long i = 0; i < 100000; i++) {
            for (long j = 0; j < 100000; j++) {
            }
        }

        long time2 = System.currentTimeMillis();

        long takenTime = (time2 - time1) / 1000;
        System.out.println("계산에 " + takenTime + " 초가 소요되었습니다.");
    }
}
