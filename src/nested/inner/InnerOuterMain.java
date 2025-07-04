package nested.inner;

public class InnerOuterMain {

    public static void main(String[] args) {
        InnerOuter outer = new InnerOuter();
        InnerOuter.Inner inner = outer.new Inner(); //x001안에의 new inner() -> 이렇게 생성해야함
        inner.print(); //123출력
    }
}
