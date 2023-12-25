package 혼자_공부하는_자바.Chapter08_인터페이스;

public class Television implements RemoteControll {
    private int volume;

    @Override
    public void turnOn() {
        System.out.println("tv를 킵니다");
    }

    @Override
    public void turnOff() {
        System.out.println("tv를 끕니다");
    }

    @Override
    public void setMaxVolume(int volume) {
        this.volume = volume;
    }
}
