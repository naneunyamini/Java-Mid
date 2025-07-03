package enumeration.ref1;

public class ClassGrade {
    // 별도의 인스턴스 3개 생성 -> 각각의 참조값을 가짐
    public static final ClassGrade BASIC = new ClassGrade(10); //x001
    public static final ClassGrade GOLD = new ClassGrade(20); //x002
    public static final ClassGrade DIAMOND = new ClassGrade(30); //x003

    private final int discountPercent;


    // classGrade 할인율 필드를 추가함
    private ClassGrade(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    // 조회 메서드 추가
    public int getDiscountPercent() {
        return discountPercent;
    }





}
