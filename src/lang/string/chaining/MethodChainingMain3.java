package lang.string.chaining;

public class MethodChainingMain3 {

    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();
        int result = adder.add(1).add(2).add(3).getValue();
        // add를 호출하면 x001이 반환되어 ->  this , 따라서 반환된 참조값을 활용하여 메스드를 연결함
        System.out.println(result);
    }
}
