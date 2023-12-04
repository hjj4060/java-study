package 혼자_공부하는_자바.클래스;

public class ClassName {
    //인스턴스 필드와 메소드
    int field1;
    void method1() {}

    //정적 필드와 메소드
    static int field2;
    static void method2() {}

    static void method3(int filed2) {
        //this.field1 = 10; //컴파일 에러
        //this.method1(); //컴파일 에러

        field2 = filed2; //앞에 this. 사용 불가능 this.은 자신의 객체를 가르키기 때문
        method2();
    }
}
