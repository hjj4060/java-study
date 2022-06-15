package thisisjava.java8to11;

import java.util.Locale;

public interface InterfaceChangeStudy {
    void printName(); //인터페이스에 정의된 메서드는 모두 public


    /**
     * @implSpec 이 구현체는 getName()으로 가져온 문자열을 대문자로 바꿔 출력한다.
     */
    default void printNameUpperCase() {
        System.out.println(getName().toUpperCase());
    }

    static void printInterfaceName() {
        System.out.println("InterfaceChangeStudy");
    }

    String getName();
}
