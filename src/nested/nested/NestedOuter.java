package nested.nested;

public class NestedOuter {

    private static int outClassValue =3; //static 필드
    private int outInstanceValue =2; // 인스턴스 생성

    static class Nested{
        private int nestedInstanceValue =1;

        public void print(){
            //자신의 멤버에 접근
            System.out.println(nestedInstanceValue);

            // 바깥 클래스의 인스턴스 멤버에 접근에는 접근할 수 없음
//            System.out.println(outInstanceValue); -> static이라서 불가

            // 바깥 클래스의 클래스 멤버에는 접근 가능 -> private이어도 가능함(같은 클래스라서)
            System.out.println(outClassValue);
        }
    }

}
