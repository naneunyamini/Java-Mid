package enumeration.ex0;

public class StringGradeEx0_1 {

    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();

        int basic = discountService.discount("BASIC",price);
        int gold = discountService.discount("GOLD",price);
        int diamond = discountService.discount("DIAMOND",price);

        System.out.println(basic);
        System.out.println(gold);
        System.out.println(diamond);

        //존재하지 않는 등급
        int vip = discountService.discount("VIP",price);
        System.out.println(vip);

        //오타
        int diaamond = discountService.discount("DIAAMOND",price);
        System.out.println(diaamond);


    }
}
