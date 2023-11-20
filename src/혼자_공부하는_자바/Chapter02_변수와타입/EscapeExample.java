package 혼자_공부하는_자바.Chapter02_변수와타입;

public class EscapeExample {
    public static void main(String[] args) {
        /**
         * \t : 탭만큼 띄움
         * \n : 줄 바꿈(라인 피드)
         * \r : 캐리지리턴
         * \" : " 출력
         * \' : ' 출력
         * \\ : \ 출력
         */

        System.out.println("번호\t이름\t직업");
        System.out.print("1행 단위 출력\n");
        System.out.print("2행 단위 출력\r");
        System.out.println("우리는 \"개발자\" 입니다.");
        System.out.print("봄\\여름\\가을\\겨울");
    }
}
