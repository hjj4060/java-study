package 혼자_공부하는_자바.Chapter08_인터페이스;

public interface RemoteControll {
    public int MAX_VOLUME = 10;
    public int MIN_VOLUME = 10;


    public void turnOn();
    public void turnOff();
    public void setMaxVolume(int volume);
}
