package enumeration.ref2;


// 바로 여기에 값을 저장함
public enum Grade {
    BASIC(10),GOLD(20),DIAMOND(30);

    private final int discountPercent;

    Grade(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }
}
