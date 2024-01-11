package 개구리.Ch06_스프링이사랑한디자인패턴.templateMehodPattern;

public abstract class Animal {
    // 템플릿 메서드
    public void playWithOwner() {
        System.out.println("귀염둥이 이리온..");
        play();
        runSomthing();
        System.out.println("잘했어");
    }

    abstract void play();

    void runSomthing() {
        System.out.println("꼬리 살랑 살랑~");
    }
}
