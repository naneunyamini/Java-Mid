package enumeration.ex2;

public class ClassMain {

    public static void main(String[] args) {
        System.out.println(ClassGrade.BASIC.getClass());
        System.out.println(ClassGrade.GOLD.getClass());
        System.out.println(ClassGrade.DIAMOND.getClass());


        // 참조값의 결과
        System.out.println(ClassGrade.BASIC);
        System.out.println(ClassGrade.GOLD);
        System.out.println(ClassGrade.DIAMOND);

    }
}
