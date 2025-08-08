package nested.test;


public class OuterClassMain2 {

    public static void main(String[] args) {
        // 여기에서 hello() 메서드를 호출해라.

        OuterClass2 outer = new OuterClass2(); // 바깥 클래스 생성
        OuterClass2.InnerClass inner = outer.new InnerClass(); // 생성
        inner.hello(); // 호출
    }
}
