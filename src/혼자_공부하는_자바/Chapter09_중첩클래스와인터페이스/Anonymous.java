package 혼자_공부하는_자바.Chapter09_중첩클래스와인터페이스;

public class Anonymous {

    Person field = new Person() {
        void work() {
            System.out.println("출근합니다");
        }

        @Override
        void wake() {
            System.out.println("6시에 일어납니다.");
            work();
        }
    };

    void method1() {
        Person localVar = new Person() {
            void work() {
                System.out.println("산책 합니다.");
            }

            @Override
            void wake() {
                System.out.println("7시에 일어납니다.");
                work();
            }
        };

        localVar.wake();
    }

    void method2(Person person) {
        person.wake();
    }
}
