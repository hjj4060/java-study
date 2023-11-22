package 혼자_공부하는_자바.Chapter02_변수와타입;

public class PrimitiveAndStringConversionExapmle {
    public static void main(String[] args) {
        int value1 = Integer.parseInt("10");
        double value2 = Double.parseDouble("10.5");
        boolean value3 = Boolean.parseBoolean("true");

        String str1 = String.valueOf(10);
        String str2 = String.valueOf(3.14);
        String str3 = String.valueOf(true);
    }
}
