package 개구리.Ch05_객체지향설계5원칙;

public class 사람example {
    public static void main(String[] args) {
        사람 로미오 = new 남자("남자");
        사람 줄리엣 = new 여자("여자");

        로미오.군번 = "102121";

        사람[] 사람arr = new 사람[]{로미오, 줄리엣};

        for (사람 사람 : 사람arr) {
            사람.print군번();
        }
    }
}