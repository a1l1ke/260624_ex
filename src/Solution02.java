public class Solution02 {
    public static void main(String[] args) {
        Engineer e1 = new Engineer();
        e1.work();
        CarEngineer e2 = new CarEngineer(); // super -> work -> getVersion <= 정적 바인딩
        e2.work();
        Engineer e3 = new CarEngineer();
        e3.work();
    }

    public static class Engineer {
        protected String value = "SECRET";

        void work() {
            System.out.println("this.getVersion() = " + this.getVersion());
        }

        private String getVersion() {
            return "1.0";
        }
    }
}

// 상속은 확장이다 (타입확장, 기능확장)
// 상위/부모 클래스는 상대적으로 좁고, 덜 구현되었다 라는 의미다,
// 하위/자식 클래스는 물려받을 것을 바탕으로 자신이 구현할 것 바꿀 것을 취사선택함
class CarEngineer extends Solution02.Engineer {
    @Override
    public void work() { // 더 넓은 호출이 가능
//    private void work() { // 더 좁은 호출은 불가능
        System.out.println("[상속받은 것]");
        super.work();
        System.out.println("[내가 한 것]");
        System.out.println("this.getVersion() = " + this.getVersion());
    }

    private void work(int i) {
        // 오버로딩 하거나 다른 이름을 써야함
    }

    private String getVersion() {
        return "2.0";
    }
}
