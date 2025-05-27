package lang.string.method;

public class StringChangeMain2 {

    public static void main(String[] args) {

        String strWithSpaces ="     Java Programing ";
        System.out.println(strWithSpaces.toLowerCase()); // 소문자로 변환
        System.out.println(strWithSpaces.toUpperCase()); // 대문자로 변환

        System.out.println(strWithSpaces.trim()); //공백제거
        System.out.println(strWithSpaces.strip()); //공백제거
        System.out.println(strWithSpaces.stripLeading()); //앞 공백 제거
        System.out.println(strWithSpaces.stripTrailing()); //뒤 공백 제거

    }
}
