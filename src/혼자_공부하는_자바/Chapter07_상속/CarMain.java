package 혼자_공부하는_자바.Chapter07_상속;

public class CarMain {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car("아반떼", 100);

        System.out.println(car1.maxSpeed);

        //메서드에서 set 네임 사용 안함, getter, setter에서만 사ㅓ용
        car1.maxSpeedPlus();
        car1.maxSpeedPlus();

        System.out.println(car1.maxSpeed);

        AvanteCar aCar = new AvanteCar();

        System.out.println(aCar.maxSpeed);
        aCar.maxSpeedPlus();
        aCar.maxSpeedPlus();
        System.out.println(aCar.maxSpeed);
        //부모객체와 자식객체 형변환해보기. 강제현변환 해보면서 값들을 잘 가져올수있는지 확인
    }
}
