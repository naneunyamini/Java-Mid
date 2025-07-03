package enumeration.ref3;


public class EnumRefMain3_4 {
    public static void main(String[] args) {
        int price = 10000;

        // for문을 통해서 -> 얼마든지 추가 가능함
        // Grade 가서 추가하기
        Grade[] grades = Grade.values();
        for (Grade grade : grades) {
            printDiscount(grade, price);
        }

    }
    private static void printDiscount(Grade grade,int price){
        System.out.println(grade.name()+"등급의 할인 금액: "+grade.discount(price));
    }
}


