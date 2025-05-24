package object;

// 부모가 없으면 묵시적으로 object 클래스를 상속받는다.
// 묵시적 : 코드에 직접 기술하지 않아도 시스템 또는 컴파일러에 의해 자동으로 수행되는 것을 의미함
// public class Parent extends Object와 같은 코드임! -> 생략하는 것을 권장함

public class Parent {

    public void parentMethod(){
        System.out.println("Parent.parentMethod");
    }
}
