package 혼자_공부하는_자바.Chapter06_인스턴스멤버와_정적멤버;

class SingletonExample {
    static void main(String[] args) {
        //Singleton obj1 = new Singleton(); //생성자를 private로 했기때문에 에러 발생

        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        if(obj1 == obj2) {
            System.out.println("같은 Singleton 객체 입니다.");
        } else {
            System.out.println("다른 Singleton 객체 입니다");
        }
    }
}
