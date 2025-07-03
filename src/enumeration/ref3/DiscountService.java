package enumeration.ref3;



public class DiscountService {

    public int discount(Grade grade, int price){
//        return price * grade.getDiscountPercent() / 100;

        return grade.discount(price); // discount로 들어가면 로직 계산이 있음

    }
}
