package enumeration.ref1;


public class DiscountService {

    public int discount (ClassGrade classGrade, int price){
        int discountPercent = classGrade.getDiscountPercent(); // 여기서 할인율값을 꺼낼 수 있음
        return price * discountPercent / 100;

        // 이거 한줄로
        // return price * classGrade.getDiscountPercent() / 100;


    }
}
