package lang.wrapper;

public class AutoboxingMain2 {
    public static void main(String[] args) {
        //Primitive -> Wrapper
        int value =7;
        Integer boxedValue = value; // 오토 박싱

        //Wrapper -> Primitive
        int unboxedValue = boxedValue; // 오토 언박싱


        // 오토 박싱과 오토 언박싱은 컴파일러가 개발자 대신 valueOf(),xxxValue() 등의 코드를 추가해주는 기능임
        System.out.println(boxedValue);
        System.out.println(unboxedValue);
    }
}
