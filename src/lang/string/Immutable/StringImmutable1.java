package lang.string.Immutable;

public class StringImmutable1 {

    public static void main(String[] args) {
        String str = "hello";
        str.concat("java");
        System.out.println(str); // hello : 문자열이 전혀 합쳐지지 않음
    }

}
