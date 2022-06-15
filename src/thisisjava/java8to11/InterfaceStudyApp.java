package thisisjava.java8to11;

public class InterfaceStudyApp {
    public static void main(String[] args) {
        InterfaceChangeStudy study = new InterfaceChangeStudyClass("hyunsu");
        study.printName(); //hyunsu
        study.printNameUpperCase(); //HYUNSU

        InterfaceChangeStudy.printInterfaceName(); //InterfaceChangeStudy
    }
}
