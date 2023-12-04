package 혼자_공부하는_자바.Chapter06_클래스;

public class EarthExample {
    public static void main(String[] args) {
        System.out.println("지구의 반지름: " + Earth.EARTH_RADIUS + " km");
        System.out.println("지구의 표면적: " + Earth.EARTH_AREA + " km^2");

        Earth earth = new Earth("나의 지구");
        System.out.println("지구의 이름: " + earth.NAME);
    }
}

