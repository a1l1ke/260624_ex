public class Solution01 {
    public static void main(String[] args) {
//        Programmer programmer = new Programmer();
        Programmer programmer = new Programmer("John", "Java");
//        programmer.name = "John";
//        programmer.language = "Java";
        programmer.work();
//        BackendProgrammer bp = new BackendProgrammer();
        BackendProgrammer bp = new BackendProgrammer("Jane", "Python");
//        bp.name = "Jane";
//        bp.language = "Python";
        bp.work();
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