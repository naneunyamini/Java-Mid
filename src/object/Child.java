package object;

// child는 명시적으로 parent를 상속 받음
public class Child extends Parent{

    public void childMethod(){
        System.out.println("child.parentMethod");
    }
}
