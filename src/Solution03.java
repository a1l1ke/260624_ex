// 업캐스팅, 다운캐스팅
public class Solution03 {

}

class Animal {
    void eat() {
        System.out.println("Animal.eat"); // soutm
    }
}

class Dog extends Animal {
    @Override
    void eat() {
        System.out.println("Dog.eat");
    }
}