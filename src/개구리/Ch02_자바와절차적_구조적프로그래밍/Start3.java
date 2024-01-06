package 개구리.Ch02_자바와절차적_구조적프로그래밍;

public class Start3 {
    public static void main(String[] args) {
        int i = 10;
        int k = 20;

        if (i == 10) {
            int m = k + 5;
            k = m;
        } else {
            int p = k + 10;
            k = p;
        }
    }
}