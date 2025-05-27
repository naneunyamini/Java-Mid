package lang.string;

public class StringConcatMain {

    public static void main(String[] args) {
        // String은 클래스임!
        String a= "hello";
        String b= " java";


        String result1 = a.concat(b); //원래 구조
        String result2 = a +b; // 문자열에서만 + 연산 제공함

        System.out.println(result1);
        System.out.println(result2);
    }
}
