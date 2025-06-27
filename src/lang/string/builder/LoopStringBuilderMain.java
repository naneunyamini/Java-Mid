package lang.string.builder;

public class LoopStringBuilderMain {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder();
        for (int i =0; i < 100000; i++){
            sb.append("Hello");
        }

        long endTime = System.currentTimeMillis();

        String result = sb.toString();
        System.out.println(result);
        System.out.println("time= "+ (endTime-startTime)+"ms");
    }
}
//StringBulider를 직접 사용하는 것이 좋은 이유
/*
반복문에서 반복해서 문자를 연결할 때
조건문을 통해 동적으로 문자열을 조합할 때
복잡한 문자열의 특정 부분을 변경해야 할 때
매우 긴 대용량 문자열을 다룰 때
 */

// StringBuffer
/*
내부에 동기화가 되어 있어서 멀티 스테드 상황에서 안전하나 오버헤드로 인한 성능이 느림
반면 StringBuilder는 멀티 스레드 상황에 안전하지 않지만 오버헤드가 없어 속도가 빠름

 */
