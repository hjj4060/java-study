package thisisjava.lambda;

import java.util.function.*;

/*
    람다
        - (인자 리스트) -> {바디}  (바디가 한줄일때는 {} 생략 가능)
    
    인자 리스트
        - 인자가 없을때 : ()
        - 인자가 한개일때 : (one) 또는 one
        - 인자가 여러개 일때 : (one, two)
        - 인자의 타입은 생략가능, 변수선언부에 있는 인자타입으로 컴파일러가 추론하지만 명시할 수도 있다 (Integer one, Integer two)

    바디
        - 화살표 오른쪽에 함수 본문을 정의한다.
        - 여러 줄인 경우에 {}를 사용해서 묶는다.
        - 한 줄인 경우에 생략 가능, return도 생략 가능
 */
public class LamdaTest {
    public static void main(String[] args) {
        //Supplier<T> 인자값 없이 T타입의 값을 제공하는 함수형 인터페이스 
        Supplier<Integer> get10 = () -> 10;
        System.out.println(get10.get()); //10

        //Function<T, R>의 특수한 형태로, 인자값 하나를 받아서 동일한 타입을 리턴하는 함수 인터페이스
        UnaryOperator<Integer> plus10 = (i) -> i + 10;
        UnaryOperator<Integer> multiply2 = (i) -> i * 2;
        System.out.println(plus10.andThen(multiply2).apply(10)); //(10+10) * 2

        //BiFunction<T, U, R>의 특수한 형태로, 동일한 타입의 입렵값 두개를 받아 리턴하는 함수 인터페이스
        BinaryOperator<Integer> getPlus = (a, b) -> a + b;

        //변수 선언부에 제네릭 타입으로 추론할수 있어서 인자에서 타입 생략 가능
        //BinaryOperator<Integer> getPlus = (Integer a, Integer b) -> a + b;

        LamdaTest lamdaTest = new LamdaTest();
        lamdaTest.run();
    }

    private void run() {
        //자바 8부터는 final 생략 가능
        //이 변수는 람다에서 사용되는 변수와 같은 Scope이다. 그래서
        final int baseNumber = 10;

        //로컬 클래스
        class LocalClass {
            void printBaseNumber() {
                int baseNumber = 11; //이 변수가 위에서 선언된 baseNumber 변수를 가린다.
                System.out.println(baseNumber);
            }
        }

        //익명 클래스
        //함수형 인터페이스 Consumer는 매개값을 단순히 소비하고 리턴은 없음
        Consumer<Integer> integerCunsumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer baseNumber) {
                baseNumber = 11; //이 변수도 위에서 선언된 baseNumber 변수를 가린다.
                System.out.println(baseNumber);
            }
        };

        //람다
        //위에서 선언된 baseNumber 변수와 동일한 Scope이다.
        IntConsumer printInt = (i) -> {
            // baseNumber = 11; 이 변수와 위에서 선언된 변수와 같은 Scope여서 에러가 발생한다.

            //baseNumber 변수는 final이거나 effective final인 경우에만 사용가능 하다.
            System.out.println(i + baseNumber);
        };

        printInt.accept(10);
    }
}
