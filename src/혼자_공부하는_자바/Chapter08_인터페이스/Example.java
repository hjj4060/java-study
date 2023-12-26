package 혼자_공부하는_자바.Chapter08_인터페이스;

public class Example {
    public static void main(String[] args) {
        ImplementationsC impl = new ImplementationsC();

        InterfaceA ia = impl;
        ia.methodA();
        System.out.println();

        InterfaceB ib = impl;
        ib.methodB();
        System.out.println();

        InterfaceC ic = impl;
        ic.methodA();
        ic.methodB();
        ic.methodC();
    }
}
