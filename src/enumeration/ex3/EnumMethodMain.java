package enumeration.ex3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class EnumMethodMain {

    public static void main(String[] args) {

        //모든 ENUM 반환
        Grade[] values = Grade.values();
        System.out.println(Arrays.toString(values)); // 리스트 값

        for (Grade value : values) {
            System.out.println(value.name()+value.ordinal()); //ordinal은 가급적 사용하지 말기
        }

        // String -> ENUM 반환, 잘못된 문자를 Input에 넣으면 예외 발생
        String input ="GOLD";
        Grade gold = Grade.valueOf(input);
        System.out.println(gold);
    }
}
