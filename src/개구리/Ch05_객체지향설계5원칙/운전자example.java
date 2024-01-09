package 개구리.Ch05_객체지향설계5원칙;

public class 운전자example {
    public static void main(String[] args) {
        수동자동차 트럭 = new 수동자동차();
        운전자 현수 = new 운전자(트럭);
    }
}
