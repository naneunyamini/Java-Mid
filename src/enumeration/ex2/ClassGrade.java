package enumeration.ex2;

//타입 안전 열거형 패턴
// 나열한 항목만 사용한다는 것이 핵심 -> basic,gold,diamond만 안전하게 사용 가능함
public class ClassGrade {
    // 별도의 인스턴스 3개 생성 -> 각각의 참조값을 가짐
    public static final ClassGrade BASIC = new ClassGrade(); //x001
    public static final ClassGrade GOLD = new ClassGrade(); //x002
    public static final ClassGrade DIAMOND = new ClassGrade(); //x003

    //private 생성자 추가
    private ClassGrade() {}





}
