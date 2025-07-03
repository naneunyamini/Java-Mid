package enumeration.ex2;

public class ClassGradeEX2_1 {
    public static void main(String[] args) {
        int price = 10000;
        DiscountService discountService = new DiscountService();
//        discountService.discount("gold"); // 이런거 안됨
        int basic = discountService.discount(ClassGrade.BASIC,price);
        int gold = discountService.discount(ClassGrade.GOLD,price);
        int diamond = discountService.discount(ClassGrade.DIAMOND,price);

        System.out.println(basic);
        System.out.println(gold);
        System.out.println(diamond);


    }
}
