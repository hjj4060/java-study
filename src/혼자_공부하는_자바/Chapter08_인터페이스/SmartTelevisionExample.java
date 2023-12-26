package 혼자_공부하는_자바.Chapter08_인터페이스;

public class SmartTelevisionExample {
    public static void main(String[] args) {
        SmartTelevision tv = new SmartTelevision();

        RemoteControl rc = tv;
        Searchable sc = tv;

        rc.search("url");
        sc.search("url2");

        System.out.println(rc.MAX_VOLUME);
        System.out.println(sc.MAX_VOLUME);
    }
}
