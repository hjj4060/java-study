package study.클래스;

import java.util.ArrayList;

public class TestMain {
    public static void main(String[] args) {
        //Raw Type
        ArrayList rawTypeList;
        ArrayList<Integer> intList = new ArrayList<Integer>();
        rawTypeList = intList;

        rawTypeList.add(1);
        rawTypeList.add("str");
    }
}
