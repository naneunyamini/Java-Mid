package object.toString;

public class ToStringMain2 {

    public static void main(String[] args) {
        Car car = new Car("Model Y");
        Dog dog1 = new Dog("멍멍이1",4);
        Dog dog2 = new Dog("멍멍이2",3);


        System.out.println("1. 단순 toString 호출");
        System.out.println(car.toString());
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());

        // println 안에는 자체적으로 toString을 호출함 -> 따라서 값이 동일함
        System.out.println("2. println 내부에서 toString 호출");
        System.out.println(car);
        System.out.println(dog1);
        System.out.println(dog2);

        System.out.println("3. 다형성 활용");
        ObjectPrinter.print(car);
        ObjectPrinter.print(dog1);
        ObjectPrinter.print(dog2);

    }
}
