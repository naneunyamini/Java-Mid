package enumeration.ex3;

public class EnumRefMain {

    public static void main(String[] args) {
        System.out.println(Grade.BASIC.getClass());
        System.out.println(Grade.GOLD.getClass());
        System.out.println(Grade.DIAMOND.getClass());

        System.out.println(refValue(Grade.BASIC));

    }

    // 참조값 나타냄
    private static String refValue(Grade grade){
        return Integer.toHexString(System.identityHashCode(grade));
        // 16진수 + 자바가 관리하는 객체의 참조값을 숫자로 반환함
    }
}
