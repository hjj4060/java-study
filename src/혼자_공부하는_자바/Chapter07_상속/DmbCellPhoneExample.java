package 혼자_공부하는_자바.Chapter07_상속;

public class DmbCellPhoneExample {
    public static void main(String[] args) {
        DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "검정", 10);

        System.out.println(dmbCellPhone.model);     //자바폰
        System.out.println(dmbCellPhone.color);     //검정
        System.out.println(dmbCellPhone.channel);   //10

        dmbCellPhone.powerOn(); //전원을 켭니다
    }
}
