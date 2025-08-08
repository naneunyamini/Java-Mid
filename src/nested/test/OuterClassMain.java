package nested.test;

public class OuterClassMain {

    public static void main(String[] args) {
        // 여기에서 hello() 메서드를 호출해라.
        OuterClass1.NestedClass nestedClass = new OuterClass1.NestedClass(); // 생성
        nestedClass.hello(); // 호출
    }
}
