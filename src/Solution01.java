public class Solution01 {
    public static void main(String[] args) {
//        Programmer programmer = new Programmer();
        Programmer programmer = new Programmer("John", "Java");
//        programmer.name = "John";
//        programmer.language = "Java";
        programmer.work();
        System.out.println("programmer = " + programmer);
//        BackendProgrammer bp = new BackendProgrammer();
        BackendProgrammer bp = new BackendProgrammer("Jane", "Python");
//        bp.name = "Jane";
//        bp.language = "Python";
        bp.work();
        System.out.println("bp = " + bp);
    }
}

class BackendProgrammer extends Programmer {
    //    BackendProgrammer() {
//        super();
//        super(name, lauguage);
//    }
    BackendProgrammer(String name, String language) {
        super(name, language); // this 생성자 체이닝처럼.
    }

    // 상속받은 work를 쓰고 있었음
    @Override
    void work() {
        System.out.println(name + "은 " + language + "로 백엔드 프로그래밍을 합니다.");
    }
    // private가 아닌 메서드의 경우에는 동적바인딩으로 현재 타입에서의 메서드를 우선한다

//    @Override // 컴파일 에러
//    void work2() {}

    // String으로 변환 시 어떻게 표현할지를 정의해주는 내장 메서드
    @Override
    public String toString() {
        return "BackendProgrammer{" +
                "name='" + name + '\'' +
                ", language='" + language + '\'' +
                '}';
    }
    // 모든 클래스는 Object 클래스를 상속받는다
    // Object toString -> custom toString으로 바꾸는 과정이다
}

class Programmer {
    String name;
    String language;

    // 직접 생성자를 만들어주었기 때문에 기본 생성자 (컴파일러가 만들어주는) 가 없어짐
//    Programmer() {
//        super();
//    }

    Programmer(String name, String language) {
        this.name = name;
        this.language = language;
    }

    void work() {
        System.out.println(name + "은 " + language + "로 프로그래밍을 합니다.");
    }
}