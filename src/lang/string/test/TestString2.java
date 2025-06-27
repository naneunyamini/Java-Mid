package lang.string.test;

public class TestString2 {

    public static void main(String[] args) {
        String[] arr = {"hello","java","jvm","spring","jpa"};

        //코드 작성
        for(int i =0; i<arr.length; i++) {
            System.out.println(arr[i]+":"+arr.length);
        }

        //또는
        int sum = 0;
       for (String s : arr) {
            System.out.println(s+":"+arr.length);
            sum += s.length();
        }
        System.out.println(sum);
    }
}
