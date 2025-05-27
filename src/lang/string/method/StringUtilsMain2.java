package lang.string.method;

public class StringUtilsMain2 {
    public static void main(String[] args) {
        int num =100;
        boolean bool = true;
        String str = "Hello,Java";

        //format 메서드
        String format1 = String.format("num: %d, bool: %b, str: %s ", num, bool, str);
        System.out.println(format1);

        String format2 = String.format("숫자: %.2f",10.1234);
        System.out.println(format2);

        //printf : 출력할 때 포멧을 한번에 받고 싶다 !
        System.out.printf("숫자: %.2f\n",10.1234);

        // matches 메서드
        String regex = "Hello, (Java! | Wolrd)";
        System.out.println(str.matches(regex)); // str이 패턴과 일치하는가 !
    }
}
