public class Solution01 {
    public static void main(String[] args) {
        Programmer programmer = new Programmer();
        programmer.name = "John";
        programmer.language = "Java";
        programmer.work();
        BackendProgrammer bp = new BackendProgrammer();
        bp.name = "Jane";
        bp.language = "Python";
        bp.work();
    }
}

class BackendProgrammer extends Programmer {
}

class Programmer {
    String name;
    String language;

    void work() {
        System.out.println(name + "은 " + language + "로 프로그래밍을 합니다.");
    }
}