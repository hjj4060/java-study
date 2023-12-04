package 혼자_공부하는_자바.Chapter06_클래스;

public class Earth {
    static final double EARTH_RADIUS = 6400;
    static final double EARTH_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
    final String NAME;

    public Earth(String name) {
        this.NAME = name;
    }
}
