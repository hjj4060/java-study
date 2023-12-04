package 혼자_공부하는_자바.Chapter05_참조_타입;

public class ArrayCreateByValueListExample1 {
    public static void main(String[] args) {
        int[] scores1 = new int[]{83, 90, 87, 24, 95};
        int[] scores2 = {83, 90, 87, 24, 95};

        System.out.println(scores1.hashCode());

        int[] score3;
        //score3 = {83, 90, 87, 24, 95};
    }
}
