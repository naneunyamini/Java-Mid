package lang.string.builder;

public class StringBuilderMain1_1 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(); // StringBuilder은 가변
        sb.append("A");
        sb.append("B");
        sb.append("C");
        sb.append("D");
        System.out.println(sb);

        sb.insert(4,"java");
        System.out.println(sb);

        sb.delete(4,8);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        //불변으로 바꾸기
        String string = sb.toString();
        System.out.println(string); // string은 불변함


    }
}
