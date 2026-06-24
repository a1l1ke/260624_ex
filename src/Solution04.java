public class Solution04 {
    public static void main(String[] args) {
        Fruit f = new Apple(); // 추상클래스 -> 하위클래스 (업캐스팅)
        System.out.println("f.price() = " + f.price());
//        Fruit f2 = new Fruit() {
//        };
        // 바로 구현하지 않으면 생성할 수 없음
        f = new Orange();
        System.out.println("f.price() = " + f.price());

        getPrice(new Apple());
        getPrice(new Orange()); // 자동으로 매개변수에 맞춰서 업캐스팅 -> 동적바인딩 때문에 각각 구현된 클래스를 따라감
//        getPrice(new KoreanFruit()); // 추상을 상속하고 실제 구현하지 않아서 추상이 유지되는 경우 여전히 new할 수 없음.
//        getKoreanPrice(new Orange()); // Fruit까지만 공유하기 때문에 들어갈 수 X.
    }

    public static void getPrice(Fruit f) {
        System.out.println("f.price() = " + f.price());
        System.out.println("f.version = " + f.version);
    }

    public static void getKoreanPrice(KoreanFruit f) {
    }
}

//class Fruit {}
abstract class Fruit {
    String version = "1.0.0"; // 다 공유함
    static String name = "과일"; // 다 공유함

    //    int price() {
//        return 1000;
//    }
    abstract int price(); // 추상화하여 위임

    void info() {
    }

    ; // 구현된 것
}

class Apple extends Fruit {
    @Override
    int price() {
        super.info();
        return 1000;
    }
}

class Orange extends Fruit {
    @Override
    int price() {
        return 2000;
    }
}

abstract class KoreanFruit extends Fruit {

}