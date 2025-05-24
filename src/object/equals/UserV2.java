package object.equals;

public class UserV2 {

    private String id;

    public UserV2(String id){
        this.id = id;
    }


    // object 재정의
    @Override
    public boolean equals(Object obj){
        // Object obj에 UserV2 user2가 넘어어고 -> 비교함

        UserV2 user = (UserV2) obj; // 다운캐스팅
        boolean result = id.equals(user.id); // string은 equals를 사용
        // 나의 id와 인스턴스로 넘어온 user.id가 같은지 확인
        return result;


    }
}
