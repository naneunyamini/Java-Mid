package lang.System;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SystemMain {

    public static void main(String[] args) {
        //현재 시간(밀리초)를 가져온다.
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println(currentTimeMillis);

        //현재 시간(나노초)를 가져온다.
        long currentTimeNano = System.nanoTime();
        System.out.println(currentTimeNano);

        //환경 변수를 읽는다.
        System.out.println(System.getenv()); // 자바 경로

        // 시스템 속성을 읽는다,
        System.out.println(System.getProperties());
        System.out.println(System.getProperty("java.version"));

        //배열을 고속으로 복사한다.
        char[] originalArray = {'h', 'e', 'l', 'l', 'o'};
        char[] copiedArray = new char[5];
        // 통째로 한번에 복사해버림
        System.arraycopy(originalArray, 0, copiedArray, 0, originalArray.length);

        // 배열 출력
        System.out.println(copiedArray);
        System.out.println(Arrays.toString(copiedArray));

        // 프로그램 종료
        System.exit(0); // 결과값이 아무것도 안나오면 정상종료
        System.out.println("hello");
    }
}
