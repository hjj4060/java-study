package 혼자_공부하는_자바.Chapter07_상속;

public class DmbCellPhone extends CellPhone {
    int channel;

    DmbCellPhone(String model, String color, int channel) {
        super(model);
        this.color = color;
        this.channel = channel;
    }
}