package lang.string.test;

public class TestString6 {
    public static void main(String[] args) {
        String str ="start hello java, hello spring, hello jpa";
        String key ="hello";

        //코드 작성
        int count =0;
        int index = str.indexOf(key);

        while(index >=0){ // 못찾으면 -1이 나오므로 나올때까지 라는 의미
            index = str.indexOf(key,index+1); //index에 넣어줘야 무한루프가 안걸림 !
            count ++;
        }

        System.out.println(count);

    }
}
