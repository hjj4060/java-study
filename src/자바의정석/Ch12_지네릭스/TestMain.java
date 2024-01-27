package 자바의정석.Ch12_지네릭스;

import java.util.*;

public class TestMain {
    public static void main(String[] args) {
        NumberClass<Integer> intNumber = new NumberClass<>(10);
        NumberClass<Double> doubleNumber = new NumberClass<>(10.5);
        NumberClass<Float> floatNumber = new NumberClass<>(10.5f);
        //NumberClass<String> StringValue = new NumberClass<>("str); //에러
    }
}
