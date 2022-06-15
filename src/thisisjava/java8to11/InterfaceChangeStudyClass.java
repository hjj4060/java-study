package thisisjava.java8to11;

public class InterfaceChangeStudyClass implements InterfaceChangeStudy {
    String name;

    public InterfaceChangeStudyClass(String name) {
        this.name = name;
    }

    @Override
    public void printName() {
        System.out.println(this.name);
    }


    @Override
    public String getName() {
        return this.name;
    }
}
