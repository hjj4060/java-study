package 혼자_공부하는_자바.Chapter07_상속;

public class CellPhone {
    protected String model;
    protected String color;

    CellPhone(String model) {

    }

    protected void powerOn() {
        System.out.println("전원을 켭니다");
    }
}