package object.poly;

public class ObjectPolyExample1 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();

        action(dog);
        action(car);

    }

    private static void action(Object obj){
        //obj.sound(); // 컴파일 오류, object는 sound()가 없음
        //obj.move(); // 컴파일 오류, object는 move()가 없음

        //객체에 맞는 다운캐스팅이 필요함
        // 위로 올라가는 것은 가능한데 아랠로 내려가는 것은 불가능하므로 다운캐스팅을 해야함
        if(obj instanceof Dog dog){
            dog.sound();
        }else if(obj instanceof Car car){
            car.move();
        }

        //Object는 모든 객체의 부모이므로 모든 객체를 대상으로 다형적 참조를 할 수 있다
        //하지만 다른 객체의 메서드가 정의되어 있지는 않다 -> 메서드 오버라이딩이 안되기 때문 !

    }
}
