package object.equals;

public class EqualsMainV1 {

    public static void main(String[] args) {

        UserV1 user1 = new UserV1("id-100");
        UserV1 user2 = new UserV1("id-200");

        System.out.println("identity = "+(user1==user2)); //false
        System.out.println("identity = "+(user1.equals(user2))); //false -> equals의 경우 재정의를 해줘야함

    }
}
