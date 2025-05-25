package lang.immuateble.change;

public class ImmutableMain1 {

    public static void main(String[] args) {
        ImmutableObj obj1 = new ImmutableObj(10);
        ImmutableObj obj2 = obj1.add(20);
        // 기존 객체의 값은 그대로 두고 대신에 변경된 결과를 새로운 객체에 담아서 반환하기

        System.out.println(obj1.getValue()); //10
        System.out.println(obj2.getValue()); //30
    }
}
