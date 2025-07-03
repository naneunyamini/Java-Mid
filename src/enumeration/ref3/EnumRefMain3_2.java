package enumeration.ref3;


public class EnumRefMain3_2 {
    public static void main(String[] args) {
        int price = 10000;

        // 이제는 discountService가 필요없어짐 -> 객체지향적으로 코드를 단순화시킴
        int basic = Grade.BASIC.discount(price);
        int gold = Grade.GOLD.discount(price);
        int diamond = Grade.DIAMOND.discount(price);

        System.out.println(basic);
        System.out.println(gold);
        System.out.println(diamond);
    }
}


