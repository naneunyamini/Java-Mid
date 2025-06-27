package lang.string.builder;

public class StringBuilderMain1_2 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(); // StringBuilder은 가변
        String string = sb.append("A").append("B").append("C").append("D")
                .insert(4,"java")
                .delete(4,8)
                .reverse()
                .toString();

        System.out.println(string);

        // chaining 사용해서 한번에 문장을 쓸 수 있음


    }
}
