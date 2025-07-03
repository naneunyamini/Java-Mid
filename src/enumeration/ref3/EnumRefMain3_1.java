package enumeration.ref3;


public class EnumRefMain3_1 {
    public static void main(String[] args) {
        int price = 10000;
        DiscountService discountService = new DiscountService();


        // 여기서도 그냥 discount 들어가면 로직 나옴
        int basic = discountService.discount(Grade.BASIC, price);
        int gold = discountService.discount(Grade.GOLD, price);
        int diamond = discountService.discount(Grade.DIAMOND, price);

        System.out.println(basic);
        System.out.println(gold);
        System.out.println(diamond);
    }
}


