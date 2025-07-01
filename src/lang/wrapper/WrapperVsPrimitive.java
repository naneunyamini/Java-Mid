package lang.wrapper;

public class WrapperVsPrimitive {
    public static void main(String[] args) {
        int iterations = 1_000_000_000;// 1000000000 와 같은 숫자
        long startTime,endTime;

        // 기본형 long 사용
        long sumPrimitive = 0;
        startTime = System.currentTimeMillis();
        for (int i =0;i<iterations;i++) {
            sumPrimitive += i;
        }
        endTime = System.currentTimeMillis();
        System.out.println(sumPrimitive);
        System.out.println(("기본 자료형 long 실행 시간: "+(endTime - startTime)));

        //래퍼 클래스 Long 사용
        long sumWrapper = 0;
        startTime = System.currentTimeMillis();
        for (int i =0;i<iterations;i++) {
            sumWrapper += i; //오토 박싱 발생
        }
        endTime = System.currentTimeMillis();
        System.out.println(sumWrapper );
        System.out.println(("기본 자료형 long 실행 시간: "+(endTime - startTime)));

        // 기본형은 메모리에서 단순히 그 크기만큼만의 공간을 차지함
        /* 래퍼 클래스의 인스턴스는 내부의 필드로 가지고 있는 기본형의 값뿐만 아니라 자바에서 객체 자체를 다루는데 필요한
           메타 데이터를 포함하므로 더 많은 메모리를 사용한다 */


        // 최적화와 유지보수 중 유지보수 하기 좋은 코드를 먼저 고민해야 함!
        // 쓸데 없는 최적화는 노옵 !!

    }
}
