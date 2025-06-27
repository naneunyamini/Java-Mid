package lang.string.chaining;

public class MethodChainingMain2 {

    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();
        ValueAdder adder1 = adder.add(1); // 반환값 돌리기
        ValueAdder adder2 = adder1.add(2);
        ValueAdder adder3 = adder2.add(3);

        int result = adder3.getValue();
        System.out.println(result);
        // adder1,adder2,adder3은 모두 참조값이 같음
    }
}
