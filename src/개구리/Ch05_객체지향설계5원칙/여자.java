package 개구리.Ch05_객체지향설계5원칙;

public class 여자 extends 사람 {
    public 여자(String 성별) {
        this.성별 = 성별;
    }

    @Override
    public void print군번() {
        System.out.println("군대에 가지 않았습니다.");
    }
}