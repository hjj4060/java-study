package 혼자_공부하는_자바.Chapter11_기본API클래스;

public class BoxingUnBoxingExample {
    public static void main(String[] args) {
        Integer obj1 = new Integer(100);
        Integer obj2 = new Integer("200");
        Integer obj3 = Integer.valueOf("300");

        Integer obj4 = 400; //자동 boxing

        int value1 = obj1.intValue();
        int value2 = obj2.intValue();
        int value3 = obj3.intValue();
        int value4 = obj4; //자동 unboxing

        System.out.println(value1);
        System.out.println(value2);
        System.out.println(value3);
        System.out.println(value4);
    }
}
