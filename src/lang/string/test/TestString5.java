package lang.string.test;

public class TestString5 {

    public static void main(String[] args) {
        String str = "Hello.txt";
        String ext = ".txt";

        //코드 작성
        int extIndex = str.indexOf(ext);
        String filename = str.substring(0, extIndex);
        String extName = str.substring(extIndex);
        System.out.println(filename);
        System.out.println(extName);



    }
}
