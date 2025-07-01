package lang.wrapper;

public class MyIntegerMethodMain1 {
    public static void main(String[] args) {
        MyInteger myInteger = new MyInteger(10);
        int i1 = myInteger.compareTo(5);
        int i2 = myInteger.compareTo(10);
        int i3 = myInteger.compareTo(20);
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);

        // MyInteger은 객체이므로 자신이 가진 메서드를 편리하게 호출 가능함
        // int는 기본형이기 때문에 스스로 메서드를 가질 수 없음
        // 객체지향적으로 기능 제공함

    }
}
