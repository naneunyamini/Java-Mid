package enumeration.ex2;

public class ClassGradeEX2_2 {
    public static void main(String[] args) {
        int price = 10000;


        DiscountService discountService = new DiscountService();
//        ClassGrade newclassGrade = new ClassGrade(); // 생성자를 또 다시 만들 수 있게 되는 실수 -> x009의 참조값을 또 만든 경우임
//        int result = discountService.discount(newclassGrade, price);
//        System.out.println(result); // 할인 X 의 결과값이 나옴

        // 따라서 class함수에서 private으로 막아야함



    }
}
