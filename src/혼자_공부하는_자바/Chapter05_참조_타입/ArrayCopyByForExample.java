package 혼자_공부하는_자바.Chapter05_참조_타입;

public class ArrayCopyByForExample {
    public static void main(String[] args) {
        String[] oldStrArray = {"java", "array", "copy"};

        String[] newStrArray = new String[5];

        System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);

        for (String str : newStrArray) {
            System.out.println(str); //{"java", "array", "copy", null, null}
        }
    }
}
