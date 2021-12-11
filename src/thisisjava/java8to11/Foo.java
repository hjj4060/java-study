package thisisjava.java8to11;

public class Foo {
    public static void main(String[] args) {


    /*
        //자바8 이전에는 익명 내부 클래스를 사용해서 인터페이스 구현
        RunSomethinig runSomethinig = new RunSomethinig() {
            @Override
            public void doIt() {
                System.out.println("Hello");
            }
        };
       */
        //자바8 이후에는 람다식으로 함수형 인터페이스 구현 가능
        //한줄일 경우에만 {} 필요없이 아래처럼 사용가능
        //RunSomethinig runSomethinig = () -> System.out.println("Hello");
/*
        //두줄 이상이상이면 경우에만 {} 괄호 묶어서 람다식 구현
        RunSomethinig runSomethinig = () -> {
            System.out.println("Hello");
            System.out.println("good");
        };
        //만든 함수 실행
        runSomethinig.doIt();
         */

        //수학적인 함수에서 가장 중요한 입력받은 값이 동일하면 결과가 같아야 한다. 이것이 보장 안되면 함수형 프로그래밍이라고 하기 어렵다.
        RunSomethinig runSomethinig = (number) -> {
            return number + 10;
        };

        //순수 함수(pure function) 함수 밖에있는 값을 참조하거나 변경하지 않는 함수, 함수는 전달받은 값만을 사용해야 한다.
        int baseNumber = 10; //이값을 사용할때 순수 함수라 볼수 없고 선택값에 의존한다

        RunSomethinig runSomethinig1 = new RunSomethinig() {
            int baseNumber = 10;// 여기도 함수 밖

            @Override
            public int doIt(int number) {
                baseNumber++; //함수 밖에있는 값을 변경하려고 할때 순수함수라 볼수 없다.
                return number + baseNumber;
            }
        };
        baseNumber++;
    }
}
