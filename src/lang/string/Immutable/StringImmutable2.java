package lang.string.Immutable;

public class StringImmutable2 {

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = str1.concat("java");
        System.out.println(str1);
        System.out.println(str2);

        // String은 불변객체이다
        // String.concat()은 내부에서 새로운 String 객체를 만들어서 반환 : 불변과 기조 객체의 값을 유지 !
        // 따라서 사이드 이펙트가 발생하지 않음 ! => 불변객체라서
    }

}
