// 업캐스팅, 다운캐스팅
public class Solution03 {
    public static void main(String[] args) {
        Animal a = new Dog(); // 묵시적, 암시적 (upcasting) -> 상속받거나 구현한 상위 클래스/인터페이스로 대입
        a.eat();
        Dog d = (Dog) a; // 힙 메모리 상에서는 a -> Dog과 인접하기 때문에 바로 사용 가능 -> 명시적 변환.
        d.eat(); // 명시적으로 해야한다는 것 외에는 문제 X.
        // 다운캐스팅.
        Animal a2 = new Animal();
        // Exception in thread "main" java.lang.ClassCastException: class Animal cannot be cast to class Dog (Animal and Dog are in unnamed module of loader 'app')
//        Dog d2 = (Dog) a2; // ClassCastException
//        d2.eat();
        if (a2 instanceof Dog) { // 너의 힙 메모리에 Dog이 있니?
            System.out.println("a2 is Dog");
            Dog d2 = (Dog) a2; // 상대적으로 안전한 방식
            d2.eat();
        } else {
            System.out.println("a2 is not Dog");
        }

        if (a instanceof Dog dd) { // 패턴매칭 축약이 있다
            dd.eat(); // jdk 16+
        }

    }
}

class Animal {
    void eat() {
        System.out.println("Animal.eat"); // soutm
    }
}

class Dog extends Animal {
    @Override
    void eat() {
        System.out.println("Dog.eat"); // 오버라이딩, 동적 바인딩
    }
}