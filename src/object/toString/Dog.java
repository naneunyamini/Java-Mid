package object.toString;

public class Dog {

    private String dogName;
    private int age;

    // 제너릭 생성
    public Dog(String dogName, int age) {
        this.dogName = dogName;
        this.age = age;
    }

//    // extends Object는 생략가능함
//    @Override
//    public String toString() {
//        return "dogName="+dogName+", age="+age;
//    }

    // 직접 코드를 치지 않아도 -> command+n 에서 toSring 하면 자동 생성


    @Override
    public String toString() {
        return "Dog{" +
                "dogName='" + dogName + '\'' +
                ", age=" + age +
                '}';
    }
}
