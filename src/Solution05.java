public class Solution05 {
    public static void main(String[] args) {
        TV tv = new TV();
        Machine m = tv;
        m.drive();
//        m.watch();
        Video v = tv;
        v.watch();
//        v.drive();
        useMachine(tv);
        useVideo(tv); // 자동 업캐스팅
    }

    static void useMachine(Machine m) {
        m.drive();
    }

    static void useVideo(Video v) {
        v.watch();
    }
}

// 1. 한 클래스를 여러 타입의 하위 클래스로 만들고 싶음 (패러미터, 변수)
// 2. 한 클래스가 여러 구현 계약을 수행하게 하고 싶음 (오버라이딩 메서드)
//abstract class Machine {
interface Machine {
    //    abstract void work();
//    void work();
    // 인터페이스는 다중 구현이 가능하다 (다중 상속 X)
    void drive();
}

//abstract class Video {
interface Video {
    //    abstract void work();
//    void work();
    void watch();
}

// 인터페이스는 힙 영역 접근 X (멤버변수 X. 오로지 같은 인터페이스 내에 구현 요청된 것들만 같이 쓸 수 있음)

// Class cannot extend multiple classes
//class TV extends Machine, Video {}
class TV implements Machine, Video {

    @Override
    public void drive() {
        System.out.println("TV.drive");
    }

    @Override
    public void watch() {
        System.out.println("TV.watch");
    }
}