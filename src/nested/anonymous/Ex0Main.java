package nested.anonymous;

//리팩토링 전
public class Ex0Main {

    public static void helloJava(){
        System.out.println("프로그램 시작");
        System.out.println("Hello java");
        System.out.println("프로그램 종료");
    }

    public static void helloSpring(){
        System.out.println("프로그램 시작");
        System.out.println("Hello spring");
        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {
        helloJava();
        helloSpring();
    }
}
