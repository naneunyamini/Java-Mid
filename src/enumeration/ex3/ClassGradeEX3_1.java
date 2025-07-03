package enumeration.ex3;


public class ClassGradeEX3_1 {
    public static void main(String[] args) {
        int price = 10000;
        DiscountService discountService = new DiscountService();
//        discountService.discount("gold"); // 이런거 안됨
        int basic = discountService.discount(Grade.BASIC,price);
        int gold = discountService.discount(Grade.GOLD,price);
        int diamond = discountService.discount(Grade.DIAMOND,price);

        System.out.println(basic);
        System.out.println(gold);
        System.out.println(diamond);


        // 따라서 열거형은 외부 생성 불가 -> private 때문임



    }
}
