package lang.string;

public class StringABasicMain {

    public static void main(String[] args) {
        String str1 = "hello"; // 기존 : "" 사용
        String str2 = new String("helo"); // 객체 생성 : ""를 객체로 변경해서 인정해줌

        System.out.println(str1);
        System.out.println(str2);
    }
}
