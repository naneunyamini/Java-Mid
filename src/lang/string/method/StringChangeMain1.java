package lang.string.method;

public class StringChangeMain1 {

    public static void main(String[] args) {

        //subString의 반환값은 string임 !
        String str = "Hello, Java! Welcome to Java";

        System.out.println("인덱스 7부터의 부분 문자열: " +str.substring(7));
        System.out.println("인덱스 7-12까지의 부분 문자열: "+str.substring(7, 12));

        System.out.println("문자열 결합: "+str.concat("!!!"));
        System.out.println("Java를 World로 대체: "+ str.replace("java","World"));
        System.out.println("첫 번째 Java를 World로 대체: "+str.replaceFirst("java","World"));
    }
}
