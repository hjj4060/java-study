package 혼자_공부하는_자바.Chapter02_변수와타입;

public class StringConcatExample {
    public static void main(String[] args) {
        String str1 = 10 + 2 + "8";
        System.out.println(str1); //128

        String str2 = "10" + 2 + 8;
        System.out.println(str2); //1028

        String str3 = "10" + (2 + 8);
        System.out.println(str3); //1010

        int intValue = Integer.parseInt("str");
        //String str = Integer.parseInt("str");
    }
}
