package lang.string.method;

public class StringComparisonMain {

    public static void main(String[] args) {
        String str1 = "hello, Java!";
        String str2 = "hello, java!";
        String str3 = "hello, world!";

        System.out.println(str1.equals(str2)); // str1과 str2가 같은지
        System.out.println(str1.equalsIgnoreCase(str2)); // 동등성 무시 -> true


        System.out.println("b".compareTo("a")); // b와 a는 1 차이
        System.out.println("a".compareTo("b")); // a와 b는 -1 차이
        System.out.println(str1.compareTo(str3));
        System.out.println(str1.compareToIgnoreCase(str2)); // 무시 !

        System.out.println("str1 starts with 'hello': "+str1.startsWith("hello"));
        System.out.println("str1 ends with 'hello': "+str1.endsWith("java"));
    }
}
