package thisisjava.java8to11;

//추상메서드가 하나만 있으면 함수형 인터페이스다.
//@FunctionalInterface 애노테이션을 붙여서 함수형 인터페이스를 정의 할 수 있다.
public interface RunSomethinig {
    //인터페이스는 필드 앞에 abstract 생략 가능
    //void doIt();

    //void doAgain(); @FuctionalInterface 애노테이션이 있으면 에러 발생

    /*
    //다른 형태의 메서드가 있어도 함수형 인터페이스 이다.
    static void printName() {
        System.out.println("kang");
    }

    default void printAge() {
        System.out.println("31");
    }
    */

    int doIt(int number);
}
