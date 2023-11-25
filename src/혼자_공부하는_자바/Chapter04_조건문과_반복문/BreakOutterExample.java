package 혼자_공부하는_자바.Chapter04_조건문과_반복문;

public class BreakOutterExample {
    public static void main(String[] args) {
        Outter: for(char upper='A'; upper <='Z'; upper++) {
            for(char lower='a'; lower<='z'; lower++) {
                System.out.println(upper + "-" + lower);
                if(lower=='g') {
                    break Outter;
                }
            }
        }
    }
}
