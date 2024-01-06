package study.클래스;

public class Student {
    //필드
    String name;
    int age;
    int grade;

    //기본 생성자
    Student() {}

    //사용자 지정 생성자
    Student(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    ////메소드
    public void info() {
        System.out.println("이름:" + name + " 나이:" + age + " 성적:" + grade);
    }
}
