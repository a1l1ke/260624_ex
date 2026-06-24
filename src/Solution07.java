// 제너릭
public class Solution07 {
    public static void main(String[] args) {
        Box<String> box = new Box<>();
        Box<Integer> box2 = new Box<>();
        // 타입에서의 유연성을 부여하는 장치 -> 제너릭
        box.setValue("Hello");
        System.out.println(box.getValue());
        box2.setValue(100);
        System.out.println(box2.getValue());
        // 오버로딩 vs 제너릭
        // 오버로딩 : 메서드명이 같고, 매개변수의 타입과 개수를 조정 => return X. 멤버변수. 클래스 단위 X.
        // 제네릭 : 선언 단위에서 원하는 타입을 넣을 수 있음 => 여러 타입을 대응하는 개념은 X.

        // 메서드 단위도 가능
        String s = box.useValue("Hello"); // 타입추론으로 String 타입을 메서드에서의 K로 정의한 것이 가져감
        int s2 = box.<Integer>useValue(10); // 타입추론으로 String 타입을 메서드에서의 K로 정의한 것이 가져감
        // public <K> K useValue(K value)
    }
}

// < > 참조타입. 인터페이스, 클래스, 추상클래스...
class Box<T> {
    //class Box<T extends Number> { // 타입 제한 -> 특정 타입 상속/구현 된 경우에만 넣을 수 있음
    private T value; // 멤버변수, 패러미터, 리턴값까지

    public void setValue(T value) {
        this.value = value;
//        T t = new T(); // 생성자를 통해 만들 수 없음 -> 소거 후 Object니까
        if (this.value instanceof T) {
            // 의미가 없음 -> 왜? T가 Object니까
        }
//        T[] arr = new T[10];
    }

    public T getValue() {
        return value;
    }

    // 메서드
    public <K> K useValue(K value) {
        return value;
    }
}
