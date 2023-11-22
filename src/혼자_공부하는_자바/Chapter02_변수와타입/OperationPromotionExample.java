package 혼자_공부하는_자바.Chapter02_변수와타입;

public class OperationPromotionExample {
    public static void main(String[] args) {
        //float floatValue = 1.2 + 3.4;
        int intValue1 = 1;
        int intValue2 = 2;

        double doubleValue1 = intValue1/intValue2;
        System.out.println(doubleValue1); //0.0

        double doubleValue2 = (double)intValue1/intValue2;
        System.out.println(doubleValue2); //0.5
    }
}
