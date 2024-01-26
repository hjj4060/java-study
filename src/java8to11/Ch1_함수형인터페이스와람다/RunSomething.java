package java8to11.Ch1_함수형인터페이스와람다;

/**
 * 추상 메서드가 단 하나만 있으면 함수형 인터페이스다
 * java8부터 인터페이스에 static, public 키워드 생략 가능
 */

@FunctionalInterface
public interface RunSomething {
    void doIt();
}
