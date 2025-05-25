package lang.immuateble.change;

public class ImmutableMain2 {

    public static void main(String[] args) {
        ImmutableObj obj1 = new ImmutableObj(10);
        obj1.add(20); // return 값을 그냥 버린것 -> 객체를 새로 만들어서 반환하기 때문에
        // 객체를 받아서 반환해야함


        System.out.println(obj1.getValue()); //10

    }
}
