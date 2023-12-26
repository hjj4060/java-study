package 혼자_공부하는_자바.Chapter08_인터페이스;

public class ImplementationsC implements InterfaceC {

    @Override
    public void methodA() {
        System.out.println("ImplC-methodA 실행");
    }

    @Override
    public void methodB() {
        System.out.println("ImplC-methodB 실행");
    }

    @Override
    public void methodC() {
        System.out.println("ImplC-methodC 실행");
    }
}
