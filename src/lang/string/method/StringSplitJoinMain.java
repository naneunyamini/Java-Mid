package lang.string.method;

public class StringSplitJoinMain {

    public static void main(String[] args) {
        String str = "Apple,Banana,Orange";

        // split()
        String[] splitStr = str.split(",");
        for (String string : splitStr) {
            System.out.println(string);
        }

        //join()
        String joinStr ="";
        for (int i = 0; i<splitStr.length; i++) {
            String string = splitStr[i];
            joinStr += string;
            if(i !=splitStr.length-1){
                joinStr += "-";
            }
        }

        System.out.println(joinStr);

        // 따라서 더 간편한 구조는 -> join()이라는 메서드
        String joinedStr = String.join("-","A","B","C");
        System.out.println(joinedStr);

        //문자열 배열 연결
        String result = String.join("-",splitStr);
        System.out.println(result);
    }
}
