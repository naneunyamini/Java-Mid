package lang.wrapper;

public class AutoboxingMain1 {
    public static void main(String[] args) {
        //Primitive -> Wrapper
        int value =7;
        Integer boxedValue = Integer.valueOf(value); // 박싱은 valueOF

        //Wrapper -> Primitive
        int unboxedValue = boxedValue.intValue(); // 언박싱은 intValue

        System.out.println(boxedValue);
        System.out.println(unboxedValue);
    }
}
