package nested.nested;

public class NestedOuterMain {

    public static void main(String[] args) {
        NestedOuter outer = new NestedOuter(); // 이거 없어도 가능
        NestedOuter.Nested nested = new NestedOuter.Nested();
        nested.print(); //1.3출력

        System.out.println(nested.getClass());
    }
}
