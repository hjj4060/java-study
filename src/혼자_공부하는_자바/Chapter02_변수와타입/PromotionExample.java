package 혼자_공부하는_자바.Chapter02_변수와타입;

public class PromotionExample {
    public static void main(String[] args) {
        byte byteValue = 10;

        //허용 범위가 큰 int 형으로 자동 타입 변환
        int intValue = byteValue;

        //정수 타입은 실수형으로 자동 타입 변환
        float floatValue = intValue;

        //char 타입은 음수 저장이 안돼서 자동 타입 변환 안됨
        //char charValue = byteValue;
    }
}