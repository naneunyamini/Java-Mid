package object.toString;

public class ObjectPrinter {

    // 메서드가 static이기 때문에 main에서 바로 호출이 가능함
    public static void print(Object obj) {
        String stirng ="객체 정보 출력: " + obj.toString();
        System.out.println(stirng);
    }
}
