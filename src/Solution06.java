import java.util.ArrayList;
import java.util.List;

// Wrapper
public class Solution06 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        // interface
//        List list = new ArrayList<>();
//        List<Object> list = new ArrayList<>();
//        List<int> list = new ArrayList<>(); // Object 상속한 타입들이어야 제네릭에 넣을 수 있음
        // wrapper
        // int -> Integer
        List<Integer> list = new ArrayList<>();
        List<Character> list2 = new ArrayList<>();
        // int, char 이외에는 대분자 붙이면 다 Wrapper가 된다
        List<Boolean> list3 = new ArrayList<>();
        List<Double> list4 = new ArrayList<>();
        // float -> Float ... 이런식.
        System.out.println(Integer.parseInt("1")); // 문자열 -> 숫자
        System.out.println(Integer.toBinaryString(100));
        // 유틸리티 클래스 -> 변환, 편의성의 메서드들이 들어가 있음 (Wrapper).
        Integer s = 0; // Wrapper 클래스는 마지막 정도에 저장용으로만.
        int s2 = s; // 오토 언박싱
        for (int i = 0; i < 100; i++) {
//            s += 1; // 100개의 새로운 Heap 객체 -> Integer.
            s2 += 1; // 대안.
            // 메모리 관리에 문제가 생길 수 있음.
        }
        s = s2;
    }
}
