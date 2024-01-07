package 개구리.Ch04_자바가_확장한_객체지향;

public class 동물 {
    void 숨쉬다() {
        System.out.println("호흡 중");
    }
}

class 포유류 extends 동물 {

    void 숨쉬다() {

    }
}